// This is a simple C program that demonstrates the use of printf and arithmetic operations
#include <stdio.h>

void main() {
    int a = 2, b = 1;
    // int a = 5, y, x = 5, z = 5;
    // printf("Hello, World!\n"+ 2);
    // printf("%d\n", 2 + 3);
    // printf("%d\n", a++);
    // printf("%d\n", ++a);
   
    // y = a++;
    // printf("%d\n", a);
    // printf("%d\n", a + 2);

    // printf("New Line\n");
    // x = ++x + z++;
    // z = z++ + ++z;
    // printf("%d\n", x);
    // printf("%d\n", z);
   
    printf("%d\n", (++a) + (++a) + (++a) + (++a)); // Undefined behavior
    printf("%d\n", (++b) + (++b) + (++b) + (++b)); // Undefined behavior

    // Safer approach
    a = 2;
    b = 1; 
    int sum_a = ++a + ++a + ++a + ++a; // Still undefined behavior
    int sum_b = ++b + ++b + ++b + ++b; // Still undefined behavior
    printf("%d\n", sum_a);
    printf("%d\n", sum_b);
}