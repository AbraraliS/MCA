/* Part- A 5 Implement recursive functions for
   binary to decimal conversion */

#include<stdio.h>
#include<math.h>
#include<conio.h>

int bindec(int,int,int);

void main()
 {
    int bn,dn = 0;
    clrscr();
    printf("enter binary number \n");
    scanf("%d",&bn);
    dn = bindec(bn,dn,0);
    printf("decimal equvilent to binary number = %d \n",dn);
    getch();
 }

 int bindec(int bn,int dn,int i)
   {
      int r;
      if(bn == 0)
       {
	 return dn;
       }
       r = bn % 10;
       dn = dn + r * pow(2,i);
       return(bindec(bn / 10, dn, i + 1));
    }