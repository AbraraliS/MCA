/*Part- B 6 Develop a program to create a binary search tree
       and implement the tree raversal techniques of
       inorder,preorder and postorder
*/

#include<stdio.h>
#include<alloc.h>
#include<conio.h>

struct node
 {
    int data;
    struct node *llink;
    struct node *rlink;
 };
typedef struct node *NODE;

NODE create(NODE,int);
void preorder(NODE);
void inorder(NODE);
void postorder(NODE);
NODE getnode();

void main()
 {
   int item,op;
   NODE root = NULL;
   clrscr();
   do
   {
      printf("1.Create \n");
      printf("2.Preorder \n");
      printf("3.Inorder \n");
      printf("4.Postorder \n");
      printf("5.Exit \n \n");
      printf("enter option \n");
      scanf("%d",&op);
      switch(op)
      {
	 case 1:
		printf("enter the item to be inserted \n");
		scanf("%d",&item);
		root = create(root,item);
		break;
	 case 2:
		if(root == NULL)
		 {
		   printf("NULL Tree \n");
		 }
		else
		 {
		   printf("Preorder traversal \n");
		   preorder(root);
		 }
		break;
	  case 3:
		if(root == NULL)
		 {
		   printf("NULL Tree \n");
		 }
		else
		 {
		   printf("Inorder traversal \n");
		   inorder(root);
		 }
		break;
	   case 4:
		if(root == NULL)
		 {
		   printf("NULL Tree \n");
		 }
		else
		 {
		   printf("Postorder traversal \n");
		   postorder(root);
		 }
		break;
	     }
 } while(op != 5);
}

NODE create(NODE root,int item)
 {
    NODE temp,cur,prev;
    temp = getnode();
    temp->data = item;
    temp->llink = NULL;
    temp->rlink = NULL;
    if(root == NULL)
     {
	return temp;
     }
    cur = root;
    while(cur != NULL)
     {
       prev = cur;
       if(item < cur->data)
	 {
	   cur = cur->llink;
	 }
       else
	{
	  cur = cur->rlink;
	}
     }
     if(item < prev->data)
      {
	 prev->llink = temp;
      }
     else
      {
	prev->rlink = temp;
      }
      return root;
   }

   void preorder(NODE root)
    {
      if(root != NULL)
	{
	   printf("%d \t",root->data);
	   preorder(root->llink);
	   preorder(root->rlink);
	}
      }

    void inorder(NODE root)
    {
      if(root != NULL)
	{
	   inorder(root->llink);
	   printf("%d \t",root->data);
	   inorder(root->rlink);
	}
      }

     void postorder(NODE root)
    {
      if(root != NULL)
	{
	   postorder(root->llink);
	   postorder(root->llink);
	   printf("%d \t",root->data);
	}
      }

NODE getnode()
{
   NODE x;
   x = (NODE) malloc(sizeof(struct node));
   return x;
}





