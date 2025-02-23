
#include <stdio.h>
#include <conio.h>
#include <math.h>

void main() {
    // Write C code here
    float a,b,c;
   // clrscr();
    printf("Enter a, b\n");
    scanf("%f %f",&a , &b);
    
    c = pow(a , b);
    
    printf("c = %f", c);
    getch();

    // return 0;
}
