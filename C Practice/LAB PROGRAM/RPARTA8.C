/* part-A 8. Develop C program to implement the search techniques of linear
   search and binary search */

#include<stdio.h>

void lsearch();
void bsearch();

void main()
 {
   int op;
   do
    {
      printf("1.Linear search \n");
      printf("2.Binary seach \n");
      printf("3.Exit \n \n");
      printf("enter option \n");
      scanf("%d",&op);

      switch(op)
       {
	 case 1:
		 lsearch();
		 break;
	 case 2:
		 bsearch();
		 break;
       }
      } while(op != 3);
   }

   void lsearch()
     {
	int a[20],n,i,key,f = 0;
	printf("enter size of an array \n");
	scanf("%d",&n);
	printf("enter array elements \n");
	for(i = 0; i < n; i++)
	 {
	   scanf("%d",&a[i]);
	 }
	printf("enter the key to be searched \n");
	scanf("%d",&key);
	for(i = 0; i < n; i++)
	 {
	   if(a[i] == key)
	     {
	       f = 1;
	       break;
	     }
	 }
	   if(f == 1)
	     {
	       printf("key found \n");
	     }
	   else
	    {
	      printf("key not found \n");
	    }
	}

       void bsearch()
	{
	  int a[20],n,i,key,low,high,mid,f = 0;
	  printf("enter size of an array \n");
	  scanf("%d",&n);
	  printf("enter array elements in ascending order \n");
	  for(i = 0; i < n; i++)
	   {
	     scanf("%d",&a[i]);
	   }
	printf("enter the key to be searched \n");
	scanf("%d",&key);
	low = 0;
	high = n - 1;
	while(low <= high)
	 {
	   mid = (low + high) / 2;
	   if(a[mid] == key)
	     {
	       f = 1;
	       break;
	     }
	   else if(key < a[mid])
	     {
	       high = mid - 1;
	     }
	   else
	   {
	     low = mid + 1;
	   }
	}
	   if(f == 1)
	     {
	       printf("key found \n");
	     }
	   else
	    {
	      printf("key not found \n");
	    }
	}



