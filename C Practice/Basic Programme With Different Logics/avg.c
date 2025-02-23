#include <stdio.h>
#include <conio.h>

void main()
{
    int m1, m2, m3, small;
    float avg;
    printf("enter m1 m2 m3\n");
    scanf("%d %d %d", &m1, &m2, &m3);

    small = m1;
    if(m2 < small){
        //printf("B is bigger\n");
        small = m2;
    }
       if(m3 < small){
        //printf("C is bigger\n");
        small = m3;
    }
    avg = ( m1 + m2 + m3 - small ) / 2.0;
    printf("avg = %f", avg);
    getch();
}