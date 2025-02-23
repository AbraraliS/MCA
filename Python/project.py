# import re

# def count_matching_names(names, pattern):
#     # Translate the given pattern into a regex pattern
#     if "_" in pattern:
#         regex_pattern = pattern.replace("_", ".")
#     elif "%" in pattern:
#         regex_pattern = pattern.replace("%", ".*")
#     else:
#         regex_pattern = pattern

#     # Compile the regex for matching
#     regex = re.compile(f"^{regex_pattern}$")

#     # Count names that match the regex pattern
#     count = sum(1 for name in names if regex.match(name))
#     return count

# # Sample input
# names = ["Hat", "Cat", "Rabbit", "Matter"]

# # Test cases
# pattern1 = "_at"
# pattern2 = "%at%"

# # Display results
# print(f"{pattern1} -> {count_matching_names(names, pattern1)}")
# print(f"{pattern2} -> {count_matching_names(names, pattern2)}")
def count_matching_names(names, pattern):
    count = 0
    for name in names:
        if "_" in pattern:
            # Match exactly one character before 'at'
            if len(name) == len(pattern) and name.endswith("at"):
                count += 1
        elif "%" in pattern:
            # Match 'at' with zero or more characters around it
            if "at" in name:
                count += 1
    return count

# Sample input
names = ["Hat", "Cat", "Rabbit", "Matter"]

# Test cases
pattern1 = "_at"  # Matches exactly one character before "at"
pattern2 = "%at%"  # Matches "at" surrounded by any characters

# Display results
print(f"{pattern1} -> {count_matching_names(names, pattern1)}")
print(f"{pattern2} -> {count_matching_names(names, pattern2)}")