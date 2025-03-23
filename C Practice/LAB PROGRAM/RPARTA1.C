/* Part - A 1. Develop a program to insert and delete an element at
   desired position in an array */

#include<stdio.h>
#include<conio.h>

void insert(int [],int,int);
void adelete(int [],int);

int n;

void main()
 {
    int a[10],i,pos,ele,op;
    clrscr();
    printf("enter the size of an array \n");
    scanf("%d",&n);
    printf("enter the array elements \n");
    for(i = 0; i < n; i++)
     {
	scanf("%d",&a[i]);
     }
    printf("entered array elements \n");
    for(i = 0; i < n; i++)
     {
	printf("%d \n",a[i]);
     }
    do
      {
	 printf("1.Insert \n");
	 printf("2.Delete \n");
	 printf("3.Exit \n \n");
	 printf("enter the option \n");
	 scanf("%d",&op);
	 switch(op)
	  {
	    case 1:
		     printf("enter the position to insert an element\n");
		     scanf("%d",&pos);
		     printf("enter an element to be inserted \n");
		     scanf("%d",&ele);
		     insert(a,pos,ele);
		     break;
	    case 2:
		     printf("enter the position to delete an element\n");
		     scanf("%d",&pos);
		     adelete(a,pos);
		     break;
	 }
	 } while(op != 3);
      }

      void insert(int a[10],int pos,int ele)
	{

	   int i;
	   if(pos <= 0 || pos > n + 1)
	     {
		printf("insertion is not possible \n");
		return;
	     }
	    for(i = n; i >= pos; i--)
	     {
	       a[i] = a[i - 1];
	     }
	    a[pos - 1] = ele;
	    n++;
	    printf("contents of array after insertion \n");
	    for(i = 0; i < n; i++)
	     {
	       printf("%d \n",a[i]);
	     }
	}

	void adelete(int a[10],int pos)
	{
	    int i;
	    if(pos <= 0 || pos > n)
	     {
		printf("deletion is not possible \n");
		return;
	     }
	    for(i = pos - 1; i < n - 1; i++)
	     {
	       a[i] = a[i + 1];
	     }
	    n--;
	    printf("the contents of array after deletion \n");
	    for(i = 0; i < n; i++)
	     {
	       printf("%d \n",a[i]);
	     }
	}







