/* Part-A 6 queue operations */

#include<stdio.h>
#include<conio.h>
#define SIZE 4

void qinsert(int);
void qdelete();
void qdisplay();

int q[SIZE],front = - 1,rear = -1;

void main()
 {
    int item,op;
    do
     {
       printf("1.Insert \n");
       printf("2.Delete \n");
       printf("3.Display \n");
       printf("4.Exit \n \n");
       printf("enter option \n");
       scanf("%d",&op);
       switch(op)
	{
	  case 1:
		  printf("enter item to be inserted \n");
		  scanf("%d",&item);
		  qinsert(item);
		  break;
	  case 2:
		  qdelete();
		  break;
	  case 3:
		  qdisplay();
		  break;
       }
      } while(op != 4);
    }

    void qinsert(int item)
     {
	if(rear == SIZE - 1)
	  {
	     printf("queue is full \n");
	     return;
	  }
	if(front == -1)
	  {
	    front = 0;
	    rear = 0;
	  }
	else
	 {
	   rear = rear + 1;
	 }
	 q[rear] = item;
     }

     void qdelete()
       {
	  if(front == -1)
	    {
	      printf("queue is empty \n");
	      return;
	    }
	  printf("delted element = %d \n",q[front]);
	  if(front == rear)
	    {
	      front = -1;
	      rear = -1;
	    }
	  else
	   {
	     front = front + 1;
	   }
     }

  void qdisplay()
    {
       int i;
       if(front == -1)
	 {
	    printf("queue is empty \n");
	    return;
	 }
       printf("contents of queue \n");
       for(i = front; i <= rear; i++)
	{
	  printf("%d \n",q[i]);
	}
    }

