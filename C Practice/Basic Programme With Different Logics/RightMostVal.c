#include <Stdio.h>
#include <conio.h>

void main()
{
    int num, rd;
    // clrscr();

    printf("Enter Number : \n");
    scanf("%d", &num);

    rd = num % 10;

    printf("Right most digit : %d", rd);
    getch();

}