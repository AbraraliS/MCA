
#include <stdio.h>
#include <conio.h>


void main() {
    // Write C code here
    int a,b,r;
    // clrscr();
    printf("Enter a, b\n");
    scanf("%d %d",&a , &b);
    
    r = a % b;
    
    printf("r = %d", r);
    getch();

    // return 0;
}
