#include <Stdio.h>
#include <conio.h>

void main()
{
    int a, b, c;
    // clrscr();

    a = -3 || 0;
    b = 5 && 0;
    c = !2;

    printf("| A = %d |\n| B = %d |\n| C = %d |\n", a, b, c);
    getch();

}