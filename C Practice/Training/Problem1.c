// 1. Alice is preparing for marathon. She practices for climbing the stairs each time she either climb one stair or two stairs.
// in how many distinct ways if she starts from the bottom in how many distinct ways can she reach the top.
// Input : int n = total number of stairs 30;
// output : 3;
// Explanation : 3 ways to reach the top
// 1. 1 -> 1 -> 1
// 2. 1 -> 2
// 3. 2 -> 1

// Input : int n = total number of stairs 5;
// output : 8;
// Explanation : 8 ways to reach the top
// 1. 1 -> 1 -> 1 -> 1 -> 1
// 2. 1 -> 1 -> 1 -> 2
// 3. 1 -> 1 -> 2 -> 1
// 4. 1 -> 2 -> 1 -> 1
// 5. 2 -> 1 -> 1 -> 1
// 6. 1 -> 2 -> 2
// 7. 2 -> 1 -> 2
// 8. 2 -> 2 -> 1

#include <stdio.h>

// Function to calculate the number of ways to reach the top
int countWays(int n) {
    if (n <= 1)
        return 1;
    int first = 1, second = 1, result;
    for (int i = 2; i <= n; i++) {
        result = first + second;
        first = second;
        second = result;
    }
    return result;
}

void main() {
    int n = 5; // total number of stairs
    printf("Number of ways to reach the top: %d\n", countWays(n));
}


