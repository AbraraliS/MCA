import math

print("### Problem 1: Finds roots of a quadratic equation ###")
a, b, c = 1, -3, 2
discriminant = b**2 - 4*a*c
x1 = (-b + math.sqrt(discriminant)) / (2 * a)
x2 = (-b - math.sqrt(discriminant)) / (2 * a)
print("Roots of quadratic equation:", x1, x2)
print("-" * 50)

print("### Problem 2: Calculate the perimeter of a rectangle ###")
length = 10
breadth = 6
perimeter = 2 * (length + breadth)
print("Perimeter:", perimeter)
print("-" * 50)

print("### Problem 3: Check if the sum of 20, 30, and 50 is not equal to 100 ###")
a, b, c = 20, 30, 50
print((a + b + c) != 100)
print("-" * 50)

print("### Problem 4: Check if a number ‘n’ lies between 30 and 100 ###")
n = 35
print(30 <= n <= 100)
n = 3
print(30 <= n <= 100)
print("-" * 50)

print("### Problem 5: Verify if either 4 + 2 == 7 or 10 > 8 is true ###")
print((4 + 2 == 7) or (10 > 8))
print("-" * 50)

print("### Problem 6: Check if both conditions 8 > 5 and 3 < 7 are true ###")
print((8 > 5) and (3 < 7))
print("-" * 50)

print("### Problem 7: Calculate average of 6 numbers: 25, 56, 12, 10, 20, 60 ###")
a, b, c, d, e, f = 25, 56, 12, 10, 20, 60
average = (a + b + c + d + e + f) / 6
print("Average:", average)
print("-" * 50)

print("### Problem 8: Find the remainder when 70 is divided by 6 ###")
a = 70
b = 6
print("Remainder:", a % b)
print("-" * 50)

print("### Problem 9: Check if the product of 30 and 40 is greater than 1000 ###")
a, b = 30, 40
print((a * b) > 1000)
print("-" * 50)

print("### Problem 10: Check if the sum of 40 and 100 is equal to product of 45 and 3 ###")
a, b = 40, 100
c, d = 45, 3
print((a + b) == (c * d))
print("-" * 50)

print("### Problem 11: Check if 13 < 10 and 6 > 3 are both true ###")
print((13 < 10) and (6 > 3))
print("-" * 50)

print("### Problem 12: Verify if either 18 < 15 or 7 == 7 is true ###")
print((18 < 15) or (7 == 7))
print("-" * 50)

print("### Problem 13: Calculate the volume of a cylinder with radius 8 and height 20 ###")
r, h = 8, 20
volume = math.pi * (r ** 2) * h
print("Volume of a cylinder:", volume)
print("-" * 50)

print("### Problem 14: Find the sum of the squares of three numbers: 3, 4, and 5 ###")
x, y, z = 3, 4, 5
result = x**2 + y**2 + z**2
print("Sum of the squares of the 3 numbers:", result)
print("-" * 50)

print("### Problem 15: Determine if the absolute difference between two numbers (100 and 80) is less than or equal to 25 ###")
a, b = 100, 80
print(abs(a - b) <= 25)
print("-" * 50)

print("### Problem 16: Verify if the perimeter of a rectangle (length=8, breadth=6) is equal to 28 ###")
l, b = 8, 6
perimeter = 2 * (l + b)
print("Perimeter:", perimeter)
print("-" * 50)

print("### Problem 17: Verify if both the area of a circle with radius 7 is greater than 100 and its perimeter is less than 50 ###")
radius = 7
area = math.pi * radius ** 2
perimeter = 2 * math.pi * radius
print(area > 100 and perimeter < 50)
print("-" * 50)

print("### Problem 18: Check if either 12%4 equal to 0 or 15%3 not equal to 0 ###")
print((12 % 4 == 0) or (15 % 3 != 0))
print("-" * 50)
