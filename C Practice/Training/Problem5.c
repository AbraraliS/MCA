/* 5. There is a string S in lower case english letters that is repeated infinitely many times. Given an int N find and print of 'A' in the first N letters of the infinite string.
* S = "abc"
* n = 10
* input : abcabcabca
* output : 4 */

#include <stdio.h>
#include <conio.h>

void main()
{
    char S[] = "abcabcabca";
    int i, cnt = 0;
    int n = sizeof(S);
    for(i = 0; i < n; i++ )
    {
        if(S[0] == S[i]){
            cnt++;
        }
    }
    printf("%d", cnt);
}