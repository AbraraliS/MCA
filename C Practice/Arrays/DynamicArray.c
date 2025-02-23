#include <stdio.h>
#include <stdlib.h>

int main() {
    int n;
    printf("Enter the size of the array: ");
    scanf("%d", &n);

    int *arr = (int *)calloc(n , sizeof(int));
    
    printf("Enter %d elements: ", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", (arr+i));
    }

    printf("Array elements: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", *(arr+i));
    }

    free(arr); // Free allocated memory
    return 0;
}