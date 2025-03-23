/* Part-A Develop a program to swap two variables using call by value and
   call by reference */
#include<stdio.h>
#include<conio.h>

void cbyvalue(int,int);
void cbyref(int *,int *);

 void main()
  {
     int a,b;
     clrscr();
     printf("enter a,b \n");
     scanf("%d %d",&a,&b);
     printf("CALL BY VALUE \n");
     cbyvalue(a,b);
     printf("CALL BY REFERENCE \n");
     cbyref(&a,&b);
     printf("a = %d b = %d \n",a,b);
     getch();
  }

  void cbyvalue(int a,int b)
    {
       int t;
       t = a;
       a = b;
       b = t;
       printf("a = %d b = %d \n",a,b);
    }

   void cbyref(int *m,int *n)
    {
       int t;
       t = *m;
       *m = *n;
       *n = t;
    }



