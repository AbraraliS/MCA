#include <Stdio.h>
#include <conio.h>

void main()
{
    int a, b, c;
    // clrscr();

    a = (5 > 3) || (2 > 8);
    b = (8 < 4) && (3 > 2);
    c = !(5 > 2);

    printf("| A = %d |\n| B = %d |\n| C = %d |\n", a, b, c);
    getch();

}