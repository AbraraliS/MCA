
#include <stdio.h>
#include <conio.h>


void main() {
    // Write C code here
    int a,b,c;
    // clrscr();
    printf("Enter a, b\n");
    scanf("%d %d",&a , &b);
    
    c = (a * a - b * b) / (a - b);
    
    printf("c = %d", c);
    getch();

    // return 0;
}
