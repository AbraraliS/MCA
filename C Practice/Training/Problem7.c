/*7. Let j and k be two indices in an array A, if j < k and A[j] < A[k], then the pair [j,k] is called as invertion pairs. Give array size of N calculate the no odd invetion pair in that array.
 *input : 1 20 6 4 5 
 *output : 5 
 */

#include <stdio.h>

int countInversionPairs(int arr[], int n) {
    int count = 0;
    for (int j = 0; j < n; j++) {
        for (int k = j + 1; k < n; k++) {
            // if (j % 2 != 0 && k % 2 != 0 && arr[j] < arr[k]) {
            //     count++;
            // }
            if(arr[j] < arr[k])
            {
                    count++;   
            }
        }
    }
    return count;
}

int main() {
    int arr[] = {1, 20, 6, 4, 5};
    int n = sizeof(arr) / sizeof(arr[0]);
    int result = countInversionPairs(arr, n);
    printf("Number of odd inversion pairs: %d\n", result);
    return 0;
}

