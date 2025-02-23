""" Write a python program which displays the count of the names that matches a given pattern from a list of names provided.
    Consider the pattern characters to be:
    1. "_at" where "_" can be one occurrence of any character
    2. "%at%" where "%" can have zero or any number of occurrences of a character
    Sample Input [Hat, Cat, Rabbit, Matter] Expected Output _at -> 2 %at% -> 3
"""

names = ["Hat", "Cat", "Rabbit", "Matter"]
pattern1 = "_at"
pattern2 = "%at%"

count1 = 0
count2 = 0

for name in names:
    if len(name) == len(pattern1) and name.endswith("at"):
        count1 = count1 + 1
    if ("at" in name):
         count2 = count2 + 1
        
print(f"{pattern1} == {count1}")
print(f"{pattern2} == {count2}")









# def cnt(names, pattern):
#     count = 0
#     for name in names:
#         if len(name) == len(pattern) and name.endswith("at"):
#             count = count+1
#         elif ("%" in pattern):
#             if ("at" in name):
#                 count = count+1
#     return count

# name = ["Hat", "Cat", "Rabbit", "Matter"]

# patter1 = "_at"
# patter2 = "%at%"

# print(f"{patter1} == {cnt(name,patter1)}")
# print(f"{patter2} == {cnt(name,patter2)}")



# names = input("Enter names separated by commas: ").split(",")
# pattern1 = input("Enter the first pattern (_at): ")
# pattern2 = input("Enter the second pattern (%at%): ")

# count1 = 0
# count2 = 0

# for name in names:
#     name = name.strip()  # Remove any extra spaces
#     if len(name) == len(pattern1) and name.endswith("at"):
#         count1 = count1 + 1
#     if ("at" in name):
#         count2 = count2 + 1

# print(f"{pattern1} == {count1}")
# print(f"{pattern2} == {count2}")


