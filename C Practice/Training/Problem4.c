// 4. Given an array of word sighted where every elements represents a bird type id. Determine id of the most frequently sighted type if more than one type is spotted then return smallest of their id's.
// input : 1 1 2 2 5 4
// output : 1

#include <stdio.h>
#include <conio.h>

void main()
{
    int a[] = {1, 1, 2, 2, 2, 5, 4};
    int i,j,cnt = 0;
    int n = sizeof(a)/sizeof(a[0]);

    for(i = 0; i < n; i++)
    {
        int temp = 0;
        for(j = 0; j < n; j++)
        {
            if(a[i] == a[j])
            {
                temp++;
            }
        }
        if(temp > cnt)
        {
            cnt = temp;
        }
    }
    for(i = 0; i < n; i++)
    {
        int temp = 0;
        for(j = 0; j < n; j++)
        {
            if(a[i] == a[j])
            {
                temp++;
            }
        }
        if(temp == cnt)
        {
            printf("%d", a[i]);
            break;
        }
    }

}
/*
#include <stdio.h>

int main() {
    int birds[] = {1, 1, 2, 2, 5, 4};
    int n = sizeof(birds) / sizeof(birds[0]);

    // Array to count occurrences (assuming bird IDs range from 1 to 5 for simplicity)
    int count[6] = {0};

    // Count the frequency of each bird type
    for(int i = 0; i < n; i++) {
        count[birds[i]]++;
    }

    // Find the most frequently sighted bird with the smallest ID
    int maxCount = 0, resultID = 0;
    for(int i = 1; i <= 5; i++) {
        if(count[i] > maxCount) {
            maxCount = count[i];
            resultID = i;
        }
    }

    printf("%d\n", resultID);

    return 0;
}
*/