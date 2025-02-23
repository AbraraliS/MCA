#include <stdio.h>
#include <conio.h>

int n;
void insert(int[],int,int);
void delete(int[],int);

int main()
{
    int arr[100],i,choice;
    int pos, item;
    printf("Enter the number of elements in the array: ");
    scanf("%d",&n);
    printf("Enter the elements of the array: ");
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    printf(" the elements of the array: ");
    for(i=0;i<n;i++)
    {
        printf("%d",arr[i]);
    }
   do
    {
        printf("\n1. Insert an element\n2. Delete an element\n3. Exit\n");
        printf("Enter your choice: ");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:
                printf("Enter Position : ");
                scanf("%d", &pos);
                printf("Enter Item : ");
                scanf("%d", &item);
                insert(arr,item,pos);
                break;
            case 2:
                printf("Enter Position : ");
                scanf("%d", &pos);
                delete(arr,pos);
                break;
        }
    }while(choice != 3);
    return 0;
}

void insert(int arr[], int item, int pos)
{
    int i;
    if((pos < 0) || pos > n+1)
    {
        printf("Insertion is not possible \n");
        return;
    }
    for(i = n; i >= pos; i--)
    {
        arr[i] = arr[i-1]; 
    }
    arr[pos] = item;
    n++;

    printf(" the elements of the array: ");
    for(i=0;i<n;i++)
    {
        printf("%d",arr[i]);
    }
}

void delete(int arr[], int pos)
{
    int i;
    if(pos > n || pos < 0)
    {
        printf("Deletion is not possible\n");
        return;
    }
    for(i = pos; i <= n; i++)
    {
        arr[i] = arr[i+1];
    }
    n--;

    printf(" the elements of the array: ");
    for(i=0; i < n; i++)
    {
        printf("%d",arr[i]);
    }
}

