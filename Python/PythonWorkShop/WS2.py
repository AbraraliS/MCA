# ---------------------------------------------------------------------
# Solution 1: Reading a Single Integer (Simple)
# ---------------------------------------------------------------------
print("\n--- Solution 1: Reading a Single Integer (Simple) ---")
age = int(input("Enter your age: "))
print("Your age:", age)
print("-" * 50)

# ---------------------------------------------------------------------
# Solution 2: Reading Multiple Integers (Simple)
# ---------------------------------------------------------------------
print("\n--- Solution 2: Reading Multiple Integers (Simple) ---")
sgpa1, sgpa2 = map(float, input("Enter two SGPA separated by space: ").split())
sum_sgpa = sgpa1 + sgpa2
avg_sgpa = sum_sgpa / 2
print(f"The sum of SGPA is: {sum_sgpa}")
print(f"The average of SGPA is: {avg_sgpa}")
print("-" * 50)

# ---------------------------------------------------------------------
# Solution 3: Reading a String and an Integer (Simple)
# ---------------------------------------------------------------------
print("\n--- Solution 3: Reading a String and an Integer (Simple) ---")
name, age = input("Enter name and age separated by space: ").split()
age = int(age)
print("Name: %s, Age: %d" % (name, age))
print("-" * 50)

# ---------------------------------------------------------------------
# Solution 4: Reading Multiple Data Types (Simple)
# ---------------------------------------------------------------------
print("\n--- Solution 4: Reading Multiple Data Types (Simple) ---")
name, age, score = input("Enter name, age, and score separated by space: ").split()
age = int(age)
score = float(score)
print("Name: {}, Age: {}, Score: {}".format(name, age, score))
print("-" * 50)

# ---------------------------------------------------------------------
# Solution 5: Reading and Printing with f-Strings (Simple)
# ---------------------------------------------------------------------
print("\n--- Solution 5: Reading and Printing with f-Strings (Simple) ---")
product, price = input("Enter product name and price separated by space: ").split()
price = float(price)
print(f"The price of {product} is ${price:.2f}")
print("-" * 50)

# ---------------------------------------------------------------------
# Solution 6: Reading Multiple Words (Simple)
# ---------------------------------------------------------------------
print("\n--- Solution 6: Reading Multiple Words (Simple) ---")
sentence = input("Enter a sentence: ")
words = sentence.split()
print(f"Words: {words}")
print("-" * 50)

# ---------------------------------------------------------------------
# Solution 7: Calculating the Average of Three Numbers (Intermediate)
# ---------------------------------------------------------------------
print("\n--- Solution 7: Calculating the Average of Three Numbers (Intermediate) ---")
a, b, c = map(int, input("Enter three integers separated by space: ").split())
average = (a + b + c) / 3
print("The average is: {:.2f}".format(average))
print("-" * 50)

# ---------------------------------------------------------------------
# Solution 8: Concatenating User Information (Intermediate)
# ---------------------------------------------------------------------
print("\n--- Solution 8: Concatenating User Information (Intermediate) ---")
first_name, last_name, age = input("Enter first name, last name, and age separated by space: ").split()
age = int(age)
print("Hello, %s %s. You are %d years old." % (first_name, last_name, age))
print("-" * 50)

# ---------------------------------------------------------------------
# Solution 9: Formatting a Table of Data (Intermediate)
# ---------------------------------------------------------------------
print("\n--- Solution 9: Formatting a Table of Data (Intermediate) ---")
product, quantity, price = input("Enter product name, quantity, and price separated by space: ").split()
quantity = int(quantity)
price = float(price)
print("Product: {:<10} Quantity: {:<5} Price: ${:.2f}".format(product, quantity, price))
print("-" * 50)

# ---------------------------------------------------------------------
# Solution 10: Temperature Conversion (Intermediate)
# ---------------------------------------------------------------------
print("\n--- Solution 10: Temperature Conversion (Intermediate) ---")
celsius = float(input("Enter temperature in Celsius: "))
fahrenheit = (celsius * 9/5) + 32
print(f"{celsius}°C is {fahrenheit:.1f}°F")
print("-" * 50)

# ---------------------------------------------------------------------
# Solution 11: Parsing Date Input (Intermediate)
# ---------------------------------------------------------------------
print("\n--- Solution 11: Parsing Date Input (Intermediate) ---")
day, month, year = input("Enter date as DD MM YYYY: ").split()
day = int(day)
month = int(month)
year = int(year)
months = [
    "January", "February", "March", "April", "May", "June",
    "July", "August", "September", "October", "November", "December"
]
if 1 <= month <= 12:
    month_name = months[month - 1]
    print("{0} {1}, {2}".format(month_name, day, year))
else:
    print("Invalid month. Please enter a month number between 1 and 12.")
print("-" * 50)

# ---------------------------------------------------------------------
# Solution 12: Calculating Body Mass Index (BMI) (Intermediate)
# ---------------------------------------------------------------------
print("\n--- Solution 12: Calculating Body Mass Index (BMI) (Intermediate) ---")
weight, height = map(float, input("Enter weight (kg) and height (m) separated by space: ").split())
if height <= 0:
    print("Height must be greater than zero.")
else:
    bmi = weight / (height ** 2)
    print(f"Your BMI is {bmi:.2f}")
print("-" * 50)

# ---------------------------------------------------------------------
# Solution 13: Student Grades Report (Complex)
# ---------------------------------------------------------------------
print("\n--- Solution 13: Student Grades Report (Complex) ---")
inputs = input("Enter student's name and three scores separated by space: ").split()
if len(inputs) != 4:
    print("Please enter exactly one name followed by three scores.")
else:
    name = inputs[0]
    scores = list(map(int, inputs[1:4]))
    average = sum(scores) / 3
    print("Student: {}".format(name))
    print("Scores: {}, {}, {}".format(scores[0], scores[1], scores[2]))
    print("Average: {:.2f}".format(average))
print("-" * 50)

# ---------------------------------------------------------------------
# Solution 14: Employee Record (Complex)
# ---------------------------------------------------------------------
print("\n--- Solution 14: Employee Record (Complex) ---")
emp_id, name, department, salary = input("Enter Employee ID, Name, Department, and Salary separated by space: ").split()
emp_id = int(emp_id)
salary = float(salary)
print("Employee ID: %d" % emp_id)
print("Name: %s" % name)
print("Department: %s" % department)
print("Salary: $%.2f" % salary)
print("-" * 50)

# ---------------------------------------------------------------------
# Solution 15: Invoice Generator (Complex)
# ---------------------------------------------------------------------
print("\n--- Solution 15: Invoice Generator (Complex) ---")
item, quantity, unit_price = input("Enter item name, quantity, and unit price separated by space: ").split()
quantity = int(quantity)
unit_price = float(unit_price)
total_price = quantity * unit_price
print("Invoice:")
print(f"Item: {item}")
print(f"Quantity: {quantity}")
print(f"Unit Price: ${unit_price:.2f}")
print(f"Total Price: ${total_price:.2f}")
print("-" * 50)

# ---------------------------------------------------------------------
# Solution 16: Advanced Date Formatting (Complex)
# ---------------------------------------------------------------------
print("\n--- Solution 16: Advanced Date Formatting (Complex) ---")
date_input = input("Enter date in YYYY-MM-DD format: ")
year, month, day = date_input.split('-')
year = int(year)
month = int(month)
day = int(day)
print("Day: {0}, Month: {1}, Year: {2}".format(day, month, year))
print("-" * 50)

# ---------------------------------------------------------------------
# Solution 17: Financial Transaction Summary (Complex)
# ---------------------------------------------------------------------
print("\n--- Solution 17: Financial Transaction Summary (Complex) ---")
description, amount, tax_rate = input("Enter transaction description, amount, and tax rate separated by space: ").split()
amount = float(amount)
tax_rate = float(tax_rate)
tax_amount = amount * (tax_rate / 100)
total = amount + tax_amount
print("Transaction: %s" % description)
print("Amount: $%.2f" % amount)
print("Tax (%.0f%%): $%.2f" % (tax_rate, tax_amount))
print("Total: $%.2f" % total)
print("-" * 50)

# ---------------------------------------------------------------------
# Solution 18: Scientific Notation Display (Complex)
# ---------------------------------------------------------------------
print("\n--- Solution 18: Scientific Notation Display (Complex) ---")
large_int, float_num = input("Enter a large integer and a floating-point number separated by space: ").split()
large_int = int(large_int)
float_num = float(float_num)
print(f"Large Integer: {large_int:.2e}")
print(f"Floating Number: {float_num:.2e}")
print("-" * 50)