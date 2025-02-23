# -----------------------------------
# Python Programming Solutions - Consolidated Script
# -----------------------------------

# 1. Strings and Their Operations
    # Simple Questions
print("1.1. Length of the string:")
input_str_1_1 = "Hello, World!"
length_1_1 = len(input_str_1_1)
print("Length of the string:", length_1_1)
print("-" * 50)

print("1.2. Convert string to uppercase:")
input_str_1_2 = "hello"
uppercase_1_2 = input_str_1_2.upper()
print("Uppercase:", uppercase_1_2)
print("-" * 50)

print("1.3. Check substring existence:")
main_str_1_3 = "Python programming"
sub_str_1_3 = "gram"
contains_substr_1_3 = sub_str_1_3 in main_str_1_3
print(f"Does '{main_str_1_3}' contain '{sub_str_1_3}'? {contains_substr_1_3}")
print("-" * 50)

print("1.4. Replace substring:")
original_1_4 = "I like apples"
modified_1_4 = original_1_4.replace("apples", "bananas")
print("Modified string:", modified_1_4)
print("-" * 50)

print("1.5. Split string into words:")
sentence_1_5 = "This is a sample sentence."
words_1_5 = sentence_1_5.split()
print("Words:", words_1_5)
print("-" * 50)

print("1.6. Concatenate strings:")
str1_1_6 = "Hello, "
str2_1_6 = "World!"
result_1_6 = str1_1_6 + str2_1_6
print("Concatenated string:", result_1_6)
print("-" * 50)

# Intermediate Questions
print("1.7. Count vowels in string:")
input_str_1_7 = "Beautiful Day"
vowels_1_7 = 'aeiouAEIOU'
count_vowels_1_7 = sum(1 for char in input_str_1_7 if char in vowels_1_7)
print("Number of vowels:", count_vowels_1_7)
print("-" * 50)

print("1.8. Reverse string:")
input_str_1_8 = "Python"
reversed_str_1_8 = input_str_1_8[::-1]
print("Reversed string:", reversed_str_1_8)
print("-" * 50)

print("1.9. Check palindrome:")
input_str_1_9 = "Madam"
cleaned_1_9 = ''.join(char.lower() for char in input_str_1_9 if char.isalnum())
is_palindrome_1_9 = cleaned_1_9 == cleaned_1_9[::-1]
print(f"Is '{input_str_1_9}' a palindrome? {is_palindrome_1_9}")
print("-" * 50)

print("1.10. First occurrence of a character:")
input_str_1_10 = "Hello, World!"
char_1_10 = 'o'
first_occurrence_1_10 = input_str_1_10.find(char_1_10)
print(f"First occurrence of '{char_1_10}' is at index:", first_occurrence_1_10)
print("-" * 50)

print("1.11. Remove all whitespaces:")
input_str_1_11 = " Python Programming "
no_whitespace_1_11 = ''.join(input_str_1_11.split())
print("String without whitespaces:", no_whitespace_1_11)
print("-" * 50)

print("1.12. Capitalize first letter of each word:")
input_str_1_12 = "hello world"
capitalized_1_12 = input_str_1_12.title()
print("Capitalized string:", capitalized_1_12)
print("-" * 50)

print("1.13. Unique characters in string:")
input_str_1_13 = "programming"
unique_chars_1_13 = set(input_str_1_13)
print("Unique characters:", unique_chars_1_13)
print("-" * 50)

print("1.14. Character frequency in string:")
input_str_1_14 = "hello"
frequency_1_14 = {}
for char in input_str_1_14:
    frequency_1_14[char] = frequency_1_14.get(char, 0) + 1
print("Character frequency:", frequency_1_14)
print("-" * 50)

print("1.15. Longest unique substring length:")
input_str_1_15 = "abcabcbb"
seen_1_15 = {}
start_1_15 = 0
max_length_1_15 = 0
for i_1_15, char_1_15 in enumerate(input_str_1_15):
    if char_1_15 in seen_1_15 and start_1_15 <= seen_1_15[char_1_15]:
        start_1_15 = seen_1_15[char_1_15] + 1
    else:
        max_length_1_15 = max(max_length_1_15, i_1_15 - start_1_15 + 1)
    seen_1_15[char_1_15] = i_1_15
print("Length of longest unique substring:", max_length_1_15)
print("-" * 50)

print("1.16. Replace multiple spaces with single space:")
import re
input_str_1_16 = "This is a test."
processed_str_1_16 = re.sub(r'\s+', ' ', input_str_1_16).strip()
print("Processed string:", processed_str_1_16)
print("-" * 50)

print("1.17. All occurrences of a substring:")
input_str_1_17 = "ababababa"
sub_str_1_17 = "aba"
start_pos_1_17 = 0
positions_1_17 = []
while True:
    pos_1_17 = input_str_1_17.find(sub_str_1_17, start_pos_1_17)
    if pos_1_17 == -1:
        break
    positions_1_17.append(pos_1_17)
    start_pos_1_17 = pos_1_17 + 1
print(f"Occurrences of '{sub_str_1_17}':", positions_1_17)
print("-" * 50)

print("1.18. Toggle case of each character:")
input_str_1_18 = "Python Programming"
toggled_case_1_18 = ''.join(char.upper() if char.islower() else char.lower() for char in input_str_1_18)
print("Toggled case:", toggled_case_1_18)
print("=" * 100)


# -----------------------------------
# 2. Lists and Their Operations
# Simple Questions
print("2.1. List of integers from 1 to 10:")
list_2_1 = list(range(1, 11))
print("List of integers:", list_2_1)
print("-" * 50)

print("2.2. Append element to list:")
my_list_2_2 = [1, 2, 3]
element_2_2 = 4
my_list_2_2.append(element_2_2)
print("List after append:", my_list_2_2)
print("-" * 50)

print("2.3. Access third element in list:")
my_list_2_3 = ['a', 'b', 'c', 'd']
if len(my_list_2_3) >= 3:
    third_elem_2_3 = my_list_2_3[2]
else:
    third_elem_2_3 = "List has fewer than 3 elements."
print("Third element:", third_elem_2_3)
print("-" * 50)

print("2.4. Remove first occurrence of element:")
my_list_2_4 = [1, 2, 3, 2, 4]
element_2_4 = 2
if element_2_4 in my_list_2_4:
    my_list_2_4.remove(element_2_4)
print("List after removal:", my_list_2_4)
print("-" * 50)

print("2.5. Find maximum element in list:")
my_list_2_5 = [10, 20, 30, 40, 50]
if my_list_2_5:
    max_elem_2_5 = max(my_list_2_5)
else:
    max_elem_2_5 = "List is empty."
print("Maximum element:", max_elem_2_5)
print("-" * 50)

print("2.6. Sort list in ascending order:")
my_list_2_6 = [5, 2, 9, 1, 5, 6]
sorted_list_2_6 = sorted(my_list_2_6)
print("Sorted list:", sorted_list_2_6)
print("-" * 50)

# Intermediate Questions
print("2.7. Reverse list:")
my_list_2_7 = [1, 2, 3, 4, 5]
reversed_list_2_7 = my_list_2_7[::-1]
print("Reversed list:", reversed_list_2_7)
print("-" * 50)

print("2.8. Common elements between two lists:")
list1_2_8 = [1, 2, 3, 4]
list2_2_8 = [3, 4, 5, 6]
common_elems_2_8 = list(set(list1_2_8) & set(list2_2_8))
print("Common elements:", common_elems_2_8)
print("-" * 50)

print("2.9. Remove duplicates from list:")
my_list_2_9 = [1, 2, 2, 3, 4, 4, 5]
no_duplicates_2_9 = list(set(my_list_2_9))
print("List without duplicates:", no_duplicates_2_9)
print("-" * 50)

print("2.10. Sum of all elements in list:")
my_list_2_10 = [10, 20, 30, 40]
sum_elements_2_10 = sum(my_list_2_10)
print("Sum of elements:", sum_elements_2_10)
print("-" * 50)

print("2.11. Check if list is empty:")
my_list_2_11 = []
is_empty_2_11 = len(my_list_2_11) == 0
print("Is the list empty?", is_empty_2_11)
print("-" * 50)

# Complex Questions Continued

# 2.13. Merge two lists and remove duplicates.
print("2.13. Merge two lists and remove duplicates:")
list1_2_13 = [1, 2, 3]
list2_2_13 = [3, 4, 5]
merged_list_2_13 = list(set(list1_2_13 + list2_2_13))
print("Merged list without duplicates:", merged_list_2_13)
print("-" * 50)

# 2.14. Find the second largest number in a list.
print("2.14. Find second largest number in list:")
my_list_2_14 = [10, 20, 20, 30, 40]
unique_list_2_14 = list(set(my_list_2_14))
if len(unique_list_2_14) < 2:
    second_largest_2_14 = "List doesn't have enough elements."
else:
    unique_list_2_14.sort()
    second_largest_2_14 = unique_list_2_14[-2]
print("Second largest number:", second_largest_2_14)
print("-" * 50)

# 2.15. Remove all occurrences of a specific element from a list.
print("2.15. Remove all occurrences of an element:")
my_list_2_15 = [1, 2, 3, 2, 4, 2]
element_2_15 = 2
filtered_list_2_15 = [x for x in my_list_2_15 if x != element_2_15]
print("List after removing all occurrences:", filtered_list_2_15)
print("-" * 50)

# 2.16. Find the index of the first occurrence of the maximum element.
print("2.16. Index of first occurrence of max element:")
my_list_2_16 = [1, 3, 5, 7, 7, 2]
if not my_list_2_16:
    index_max_2_16 = "List is empty."
else:
    max_val_2_16 = max(my_list_2_16)
    index_max_2_16 = my_list_2_16.index(max_val_2_16)
print("Index of first occurrence of max element:", index_max_2_16)
print("-" * 50)

# 2.17. Create a new list with elements squared from the original list.
print("2.17. List with squared elements:")
my_list_2_17 = [1, 2, 3, 4]
squared_list_2_17 = [x**2 for x in my_list_2_17]
print("Squared elements:", squared_list_2_17)
print("-" * 50)

# 2.18. Find all prime numbers in a list.
print("2.18. Prime numbers in list:")
def is_prime_2_18(n):
    if n < 2:
        return False
    for i in range(2, int(n**0.5)+1):
        if n % i == 0:
            return False
    return True

my_list_2_18 = [2, 3, 4, 5, 6, 7, 8, 9, 10]
primes_2_18 = {x for x in my_list_2_18 if is_prime_2_18(x)}
print("Prime numbers:", primes_2_18)
print("-" * 50)

print("=" * 100)
