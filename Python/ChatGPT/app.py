# app.py
import streamlit as st
import pandas as pd
import json
import plotly.express as px
from sentence_transformers import SentenceTransformer
import umap
import hdbscan
from sklearn.preprocessing import LabelEncoder

st.set_page_config(layout="wide", page_title="ChatGPT History Visualizer", page_icon="🧠")

st.title("🧠 ChatGPT Semantic History Visualizer")
st.markdown("Upload your `conversations.json` file and explore your ChatGPT memory through semantic clustering.")

# Upload JSON
uploaded_file = st.file_uploader("📁 Upload your conversations.json", type="json")

if uploaded_file:
    try:
        data = json.load(uploaded_file)
        if isinstance(data, list):
            conversations = data
        elif isinstance(data, dict) and "conversations" in data:
            conversations = data["conversations"]
        else:
            st.error("❌ Invalid JSON structure.")
            st.stop()

        # Extract valid texts and titles
        texts, titles = [], []
        for convo in conversations:
            if isinstance(convo.get("text", ""), str):
                texts.append(str(convo["text"]))
                titles.append(convo.get("title", "No Title"))

        # Embed using SentenceTransformer
        st.info("🔄 Generating semantic embeddings…")
        model = SentenceTransformer("all-MiniLM-L6-v2")
        embeddings = model.encode(texts)

        # Reduce with UMAP
        reducer = umap.UMAP(n_neighbors=15, min_dist=0.1, metric="cosine")
        reduced = reducer.fit_transform(embeddings)

        # Cluster with HDBSCAN
        st.info("🔍 Performing semantic clustering…")
        clusterer = hdbscan.HDBSCAN(min_cluster_size=5, metric='euclidean', cluster_selection_method='eom')
        labels = clusterer.fit_predict(reduced)
        label_encoder = LabelEncoder()
        label_names = label_encoder.fit_transform(labels)

        # Create DataFrame
        df = pd.DataFrame(reduced, columns=["x", "y"])
        df["text"] = texts
        df["title"] = titles
        df["topic"] = ["Topic " + str(label) if label != -1 else "Noise" for label in label_names]

        # Sidebar filters
        st.sidebar.title("🎛 Filters")
        topic_filter = st.sidebar.multiselect("Select Topics", sorted(df["topic"].unique()), default=sorted(df["topic"].unique()))
        keyword = st.sidebar.text_input("Search keyword in text")

        filtered_df = df[df["topic"].isin(topic_filter)]
        if keyword:
            filtered_df = filtered_df[filtered_df["text"].str.contains(keyword, case=False)]

        # Plot
        fig = px.scatter(
            filtered_df,
            x="x", y="y",
            color="topic",
            hover_data=["title", "text"],
            title="📌 Semantic Map of ChatGPT Conversations",
            width=1100,
            height=700
        )
        fig.update_traces(marker=dict(size=10, opacity=0.75))
        st.plotly_chart(fig, use_container_width=True)

        st.markdown("#### 🗂 Conversation Details")
        for _, row in filtered_df.iterrows():
            with st.expander(f"🧵 {row['title']} — *{row['topic']}*"):
                st.write(row["text"])

    except Exception as e:
        st.exception(e)
