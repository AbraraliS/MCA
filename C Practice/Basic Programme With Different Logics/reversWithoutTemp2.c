
#include <stdio.h>
#include <conio.h>


void main() {
    // Write C code here
    int a,b;
    // clrscr();
    printf("Enter a, b\n");
    scanf("%d %d",&a , &b);
    
    a = a - b;
    b = a + b;
    a = b - a;
    
    printf("a = %d b = %d", a, b);
    getch();

    // return 0;
}
