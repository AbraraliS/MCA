/* Part-A 2 Develop a program to introduce 2D array manipulation
   and implement Matrix manipulation and ensure the the rules of
   multiplication are checked */

#include<stdio.h>
#include<conio.h>
#include<process.h>

void main()
 {
   int a[5][5],b[5][5],c[5][5],m,n,p,q,i,j,k;
   clrscr();
   printf("enter the size of matrix A \n");
   scanf("%d %d",&m,&n);
   printf("enter the size matrix B \n");
   scanf("%d %d",&p,&q);
   if(n != p)
    {
      printf("matrix multiplication is not possible \n");
      getch();
      exit(0);
    }
   printf("enter matrix A elements \n");
   for(i = 0; i < m; i++)
    {
      for(j = 0; j < n; j++)
	{
	   scanf("%d",&a[i][j]);
	}
    }
   printf("enter matrix B elements \n");
   for(i = 0; i < p; i++)
    {
      for(j = 0; j < q; j++)
	{
	   scanf("%d",&b[i][j]);
	}
    }

   for(i = 0; i < m; i++)
    {
      for(j = 0; j < q; j++)
	{
	   c[i][j] = 0;
	 for(k = 0; k < n; k++)
	   {
	     c[i][j] = c[i][j] + a[i][k] * b[k][j];
	   }
	}
    }

    printf("resultant matrix \n");
    for(i = 0; i < m; i++)
    {
      for(j = 0; j < q; j++)
	{
	   printf("%d \t",c[i][j]);
	}
	printf("\n");
    }
    getch();
    }