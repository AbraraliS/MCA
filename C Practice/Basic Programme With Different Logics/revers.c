
#include <stdio.h>
#include <conio.h>


void main() {
    // Write C code here
    int a,b,t;
    // clrscr();
    printf("Enter a, b\n");
    scanf("%d %d",&a , &b);
    
    t = a;
    a = b;
    b = t;
    
    printf("a = %d b = %d", a, b);
    getch();

    // return 0;
}
