#include <stdio.h>
#include <conio.h>

void main()
{
    int m1;
   
    printf("enter m1\n");
    scanf("%d", &m1);

    
    if(m1 % 2 == 0){
        printf("its even\n");
        
    }
else {
     printf("its Odd\n");
     
    }
   
   getch();
}