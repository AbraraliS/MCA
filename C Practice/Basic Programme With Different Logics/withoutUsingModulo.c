
#include <stdio.h>
#include <conio.h>


void main() {
    // Write C code here
    int a,b,r,q;
    // clrscr();
    printf("Enter a, b\n");
    scanf("%d %d",&a , &b);
    q = a / b;
    r = a - q * b;
    
    printf("r = %d", r);
    getch();

    // return 0;
}
