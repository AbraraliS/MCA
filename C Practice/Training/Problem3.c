#include <stdio.h>
#include <conio.h>

void main()
{
    int n,d;
    scanf("%d", &n);
    scanf("%d", &d);
    int a[n];
    for(int i = 0; i < n; i++)
    {
        int x = (n - d + i) % n;
        scanf("%d", &a[x]);
    }
    for(int i = 0; i < n; i++)
    {
        printf("%d ", a[i]);
    }

}