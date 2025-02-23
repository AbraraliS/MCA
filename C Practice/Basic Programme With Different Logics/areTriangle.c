
#include <stdio.h>
#include <conio.h>

int main() {
    // Write C code here
    int a,b,h;
   // clrscr();
    printf("Enter b, h\n");
    scanf("%d %d",&b , &h);
    
    a = 0.5 * b * h;
    
    printf("a = %d", a);
    getch();

     return 0;
}
