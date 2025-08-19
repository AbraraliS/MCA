import streamlit as st
import json
import pandas as pd
import numpy as np
from sentence_transformers import SentenceTransformer
import umap.umap_ as umap
import plotly.graph_objects as go
from datetime import datetime

# Set futuristic theme
st.set_page_config(page_title="🧠 Neural Memory Explorer", layout="wide", page_icon="🧬")

# Custom CSS for a glowing, neural feel
st.markdown("""
<style>
body {
    background-color: #0d0d0d;
    color: #ffffff;
    font-family: 'Segoe UI', sans-serif;
}
.stApp {
    background: linear-gradient(145deg, #0f0f0f, #1a1a1a);
    color: #ffffff;
}
h1, h2 {
    color: #00f9ff;
    text-shadow: 0 0 8px #00f9ff;
}
</style>
""", unsafe_allow_html=True)

# ------------------------------
# Load Data
# ------------------------------
@st.cache_data
def load_data():
    with open("conversations.json", "r", encoding="utf-8") as f:
        conversations = json.load(f)

    all_messages = []
    for convo in conversations:
        mapping = convo.get("mapping", {})
        for msg in mapping.values():
            message = msg.get("message")
            if not message:
                continue

            content = message.get("content", "")
            text = ""

            if isinstance(content, str):
                text = content
            elif isinstance(content, dict):
                text = content.get("text", "")
                parts = content.get("parts", [])
                if not text and isinstance(parts, list) and len(parts) > 0:
                    text = parts[0]

            if isinstance(text, str) and text.strip():
                all_messages.append({
                    "title": convo.get("title", "Untitled"),
                    "date": datetime.fromtimestamp(convo.get("create_time", 0)).strftime('%Y-%m-%d'),
                    "content": text.strip()
                })

    return pd.DataFrame(all_messages)

# ------------------------------
# Compute Embeddings
# ------------------------------
@st.cache_data
def compute_embeddings(texts):
    model = SentenceTransformer("all-MiniLM-L6-v2")
    return model.encode(texts, show_progress_bar=True)

# ------------------------------
# Reduce Dimensions (3D)
# ------------------------------
@st.cache_data
def reduce_dimensions(embeddings):
    reducer = umap.UMAP(n_components=3, random_state=42, n_neighbors=15, min_dist=0.2)
    return reducer.fit_transform(embeddings)

# ------------------------------
# Build 3D Plot
# ------------------------------
def plot_3d(df, reduced):
    fig = go.Figure()

    fig.add_trace(go.Scatter3d(
        x=reduced[:, 0],
        y=reduced[:, 1],
        z=reduced[:, 2],
        mode='markers',
        marker=dict(
            size=5,
            color=np.linspace(0, 1, len(df)),  # gradient
            colorscale='Viridis',
            opacity=0.85,
            line=dict(width=0)
        ),
        text=df["content"],
        hovertemplate="<b>%{text}</b><extra></extra>"
    ))

    fig.update_layout(
        template="plotly_dark",
        paper_bgcolor="#0d0d0d",
        scene=dict(
            xaxis=dict(backgroundcolor="#111", gridcolor="gray"),
            yaxis=dict(backgroundcolor="#111", gridcolor="gray"),
            zaxis=dict(backgroundcolor="#111", gridcolor="gray")
        ),
        margin=dict(l=0, r=0, b=0, t=40),
        height=700,
        title="💫 Semantic Galaxy of Your Conversations"
    )
    return fig

# ------------------------------
# Main Interface
# ------------------------------
st.title("💫 Neural Memory Explorer")
st.markdown("Explore your **ChatGPT conversations** in 3D semantic space. Everything is connected. Welcome to your mind.")

try:
    df = load_data()
    st.success(f"Loaded {len(df)} messages.")

    with st.spinner("🧠 Computing embeddings..."):
        embeddings = compute_embeddings(df["content"].tolist())

    with st.spinner("🌀 Reducing dimensions..."):
        reduced = reduce_dimensions(embeddings)

    fig = plot_3d(df, reduced)
    st.plotly_chart(fig, use_container_width=True)

    with st.expander("📜 Show Raw Data"):
        st.dataframe(df)

    st.caption("🔗 Powered by UMAP, Transformers, and your digital thoughts.")

except FileNotFoundError:
    st.error("❌ 'conversations.json' not found in the app directory.")
except Exception as e:
    st.exception(e)
