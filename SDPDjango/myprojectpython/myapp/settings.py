INSTALLED_APPS = [
    # ... other apps ...
    'myapp',
]
TEMPLATES = [
    {
        # ... existing config ...
        'DIRS': [BASE_DIR / "templates"],
        # ... existing config ...
    },
]