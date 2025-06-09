/* program to implement stack */
#include<stdio.h>
#include<conio.h>
#define  SIZE 4

void push(int);
void pop();
void display();
int s[SIZE];
int top = -1;

void main()
  {
     int item,op;
     clrscr();
     do
      {
	 printf("1.push\n");
	 printf("2.pop \n");
	 printf("3.display \n");
	 printf("4.exit \n \n");
	 printf("enter option \n");
	 scanf("%d",&op);
	 switch(op)
	  {
	    case 1:
		    printf("enter the item to be inserted \n");
		    scanf("%d",&item);
		    push(item);
		    break;
	    case 2:
		    pop();
		    break;
	    case 3:
		    display();
		    break;
	    case 4:
		    exit();
	 }
	 } while(op != 4);
      }

      void push(int item)
       {
	 if(top == SIZE - 1)
	   {
	      printf("stack overflow \n");
	      return;
	   }
	  top = top + 1;
	  s[top] = item;
	}

	void pop()
	{
	  if(top == -1)
	   {
	     printf("stack underflow \n");
	     return;
	   }
	   printf("popped elemnt = %d \n",s[top]);
	   top = top - 1;
	 }
	void display()
	{
	  int i;
	  if(top == -1)
	   {
	     printf("stack is empty \n");
	     return;
	   }
	   printf("contents of stack \n");
	   for(i = top; i >= 0; i--)
	    {
	       printf("%d \n", s[i]);
	    }

	 }




