#include <Stdio.h>
#include <conio.h>

void main()
{
    int a = 5, b = 8, c, d;
    // clrscr();

    c = a++;
    d = ++b;

    printf("| A = %d |\n| B = %d |\n| C = %d |\n| D = %d |\n", a, b, c ,d);
    getch();

}