#include <stdio.h>
#define MAX 100

int queue[MAX];
int priority[MAX];
int size = 0;

void insert(int value, int prio) {
    if (size == MAX) {
        printf("Queue is full!\n");
        return;
    }

    int i;
    for (i = size - 1; i >= 0; i--) {
        if (priority[i] < prio) {
            queue[i + 1] = queue[i];
            priority[i + 1] = priority[i];
        } else {
            break;
        }
    }

    queue[i + 1] = value;
    priority[i + 1] = prio;
    size++;
}

int delete() {
    if (size == 0) {
        printf("Queue is empty!\n");
        return -1;
    }
    int value = queue[0];
    for (int i = 0; i < size - 1; i++) {
        queue[i] = queue[i + 1];
        priority[i] = priority[i + 1];
    }
    size--;
    return value;
}

void display() {
    if (size == 0) {
        printf("Queue is empty!\n");
        return;
    }
    printf("Priority Queue: ");
    for (int i = 0; i < size; i++) {
        printf("%d(p%d) ", queue[i], priority[i]);
    }
    printf("\n");
}

int main() {
    int choice, value, prio;

    while (1) {
        printf("\nPriority Queue Menu:\n");
        printf("1. Insert\n2. Delete\n3. Display\n4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter value and priority: ");
                scanf("%d %d", &value, &prio);
                insert(value, prio);
                break;
            case 2:
                value = delete();
                if (value != -1) {
                    printf("Deleted: %d\n", value);
                }
                break;
            case 3:
                display();
                break;
            case 4:
                return 0;
            default:
                printf("Invalid choice!\n");
        }
    }
}
