#include <stdio.h>
#include <conio.h>

void main()
{
    int a,b,c;
    printf("enter a b c\n");
    scanf("%d %d %d", &a, &b, &c);

    if(b<a){
        //printf("B is bigger\n");
        a = b;
    }
       if(c<a){
        //printf("C is bigger\n");
        a = c;
    }
    printf("%d is Smaller", a);
    getch();
}