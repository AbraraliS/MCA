#include <Stdio.h>
#include <conio.h>

void main()
{
    int n, rd, q;
    // clrscr();

    printf("Enter Number : \n");
    scanf("%d", &n);

    q = n / 10;
    rd = n - q * 10;

    printf("Right most digit : %d", rd);
    getch();

}