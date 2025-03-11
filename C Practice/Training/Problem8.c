// 8. In an array superior element is the one that is greater than all the elements to its right, right most element is always superior. find the number of superior element in the array. 

#include <stdio.h>

int countSuperiorElements(int arr[], int n) {
    int count = 0;
    int max_from_right = arr[n-1];
    count++; // The rightmost element is always a superior element

    for (int i = n-2; i >= 0; i--) {
        if (arr[i] > max_from_right) {
            count++;
            max_from_right = arr[i];
        }
    }
    return count;
}

int main() {
    int arr[] = {5, 4, 3, 1, 6, 7, 8};
    int n = sizeof(arr) / sizeof(arr[0]);
    int result = countSuperiorElements(arr, n);
    printf("Number of superior elements: %d\n", result);
    return 0;
}