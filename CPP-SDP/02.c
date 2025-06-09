// Given name is palindrom or not
#include <stdio.h>

void main() {
    char name[100];
    int i, j, len = 0;
    printf("Enter a string: ");
    gets(name);
    for (i = 0; name[i] != '\0'; i++) {
        len++;
    }
    for (i = 0, j = len - 1; i < j; i++, j--) {
        if (name[i] != name[j]) {
            printf("Not a palindrome\n");
            return;
        }
    }
    printf("Palindrome\n");
}
