/* Part-A 3 Write functions to implement string operations
   such as compare,concatenate.string length.Convince
   the parameter passing techniques */

#include<stdio.h>
#include<conio.h>

void slength(char []);
void sconcat(char [],char []);
void scompare(char [],char []);

void main()
 {
    char s1[50],s2[50];
    int op;
    clrscr();
    do
     {
	printf("1.String length \n");
	printf("2.String concat \n");
	printf("3.String compare \n");
	printf("4.Exit \n \n");
	printf("enter option \n");
	scanf("%d",&op);
	fflush(stdin);
	switch(op)
	 {
	    case 1:
		    printf("enter a string \n");
		    scanf("%s",s1);
		    slength(s1);
		    break;
	    case 2:
		    printf("enter a string 1  \n");
		    scanf("%s",s1);
		    printf("enter a string 2  \n");
		    scanf("%s",s2);
		    sconcat(s1,s2);
		    break;
	    case 3:
		    printf("enter a string1  \n");
		    scanf("%s",s1);
		    printf("enter a string2  \n");
		    scanf("%s",s2);
		    scompare(s1,s2);
		    break;
	 }
	} while(op != 4);
      }

     void slength(char s1[50])
       {
	  int i,len = 0;
	  for(i = 0; s1[i] != '\0'; i++)
	    {
	       len++;
	    }
	  printf("length of a string = %d \n",len);
       }

     void sconcat(char s1[50],char s2[50])
       {
	  int i = 0,j = 0;
	  while(s1[i] != '\0')
	    {
	       i++;
	    }
	  while(s2[j] != '\0')
	    {
	       s1[i] = s2[j];
	       i++;
	       j++;
	    }
	   s1[i] = '\0';
	   printf("concatenated string = %s \n",s1);
	}

      void scompare(char s1[50],char s2[50])
	{
	    int i = 0,m;
	    while(s1[i] == s2[i])
	      {
		 if(s1[i] == '\0')
		   {
		      break;
		    }
		  i++;
	       }
	     m = s1[i] - s2[i];
	     if(m == 0)
	       {
		  printf("m = %d \n",m);
		  printf("two strings are equal \n");
	       }
	     else if(m > 0)
	       {
		  printf("m = %d \n",m);
		  printf("first string is greater than the second string \n");
	       }
	     else
	      {
		  printf("m = %d \n",m);
		  printf("first is less than the second string \n");
	       }
	  }




