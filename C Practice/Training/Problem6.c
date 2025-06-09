// 6. There are N straight line that are non parallel and no 3 lines go through to the same point. The lines divide the plain into M region's write a function to find the maximum number of region's that can be formed on the plain.
// [Note : Since the answer can be quite large modulo it by 1000000007]. 

#include <stdio.h>
#include <conio.h>

void main()
{
    int n;
    scanf("%d", &n);
    int r = (n * (n + 1) / 2) + 1;
    // r = n + r + 1;
    printf("%d", r%1000000007);
}