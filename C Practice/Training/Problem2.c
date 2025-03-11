// 2. Arithmatic array is an array that contain atleast two integers and diffrence between consicutive int or equal. Given an array of non negative int & determine the lenght of logest contigeous Arithmatic sub array.


#include <stdio.h>

int longestArithmeticSubarray(int arr[], int n) {
    if (n < 2) return n;

    int maxLength = 2;
    int currentLength = 2;
    int commonDifference = arr[1] - arr[0];

    for (int i = 2; i < n; i++) {
        if (arr[i] - arr[i - 1] == commonDifference) {
            currentLength++;
        } else {
            commonDifference = arr[i] - arr[i - 1];
            currentLength = 2;
        }
        if (currentLength > maxLength) {
            maxLength = currentLength;
        }
    }

    return maxLength;
}

int main() {
    int arr[] = {9, 7, 5, 1, 2, 4, 6 ,8, 10, 3, 6, 9, 12, 15, 18, 18, 24};
    int n = sizeof(arr) / sizeof(arr[0]);

    int result = longestArithmeticSubarray(arr, n);
    printf("Length of the longest contiguous arithmetic subarray: %d\n", result);

    return 0;
}