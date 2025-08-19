# 📦 Required Libraries
import json
import pandas as pd
from sentence_transformers import SentenceTransformer
import umap
import plotly.express as px
from sklearn.cluster import KMeans

# 📥 Load your ChatGPT history JSON file
# Use raw string (r"...") or forward slashes
with open(r"D:/OneDrive/Desktop/MCA/Python/ChatGPT/conversations.json", encoding="utf-8") as f:
    data = json.load(f)

# 📃 Extract first user message from each conversation
conversations = []
for convo in data:
    title = convo.get("title", "Untitled")
    messages = convo.get("mapping", {}).values()
    user_msgs = [
        m["message"]["content"]["parts"][0]
        for m in messages
        if m.get("message") and m["message"].get("author", {}).get("role") == "user"
    ]
    if user_msgs:
        conversations.append({"title": title, "text": user_msgs[0]})

# ✅ Filter valid conversations (with non-empty text)
texts = [str(c["text"]) for c in conversations if isinstance(c.get("text", ""), str)]
titles = [c["title"] for c in conversations if isinstance(c.get("text", ""), str)]

# 🧠 Generate semantic embeddings
model = SentenceTransformer("all-MiniLM-L6-v2")
embeddings = model.encode(texts)

# 🔵 Cluster using KMeans
n_clusters = 5
kmeans = KMeans(n_clusters=n_clusters, random_state=42)
labels = kmeans.fit_predict(embeddings)

# 🌐 Reduce dimensionality with UMAP
reduced = umap.UMAP(n_neighbors=15, min_dist=0.1, random_state=42).fit_transform(embeddings)

# 📊 Create DataFrame for visualization
df = pd.DataFrame(reduced, columns=["x", "y"])
df["text"] = texts
df["title"] = titles
df["topic"] = [f"Topic {label}" for label in labels]

# 🎨 Plot semantic map with Plotly
fig = px.scatter(
    df,
    x="x", y="y",
    color="topic",
    hover_data=["title", "text"],
    title="🧠 Semantic Map of ChatGPT Conversations by Topic",
    width=950,
    height=650
)
fig.update_traces(marker=dict(size=10, line=dict(width=0.5, color="DarkSlateGrey")))
fig.show()

import plotly.io as pio
pio.renderers.default = "browser"

# 🎨 Plot semantic map with Plotly
fig = px.scatter(
    df,
    x="x", y="y",
    color="topic",
    hover_data=["title", "text"],
    title="🧠 Semantic Map of ChatGPT Conversations by Topic",
    width=950,
    height=650
)
fig.update_traces(marker=dict(size=10, line=dict(width=0.5, color="DarkSlateGrey")))
fig.show()
