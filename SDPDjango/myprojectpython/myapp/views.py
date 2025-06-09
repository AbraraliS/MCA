from django.shortcuts import render

# Temporary in-memory storage for submitted data
data_list = []

def index(request):
    if request.method == "POST":
        new_data = request.POST.get("data")
        data_list.append(new_data)
    return render(request, "index.html", {"data": data_list})