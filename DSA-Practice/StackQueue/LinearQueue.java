package StackQueue;

import java.util.Scanner;

public class LinearQueue {
    static int SIZE = 4;
    static int[] q = new int[SIZE];
    static int front = -1, rear = -1;

    static void qInsert(int item) {
        if (rear == SIZE - 1) {
            System.out.println("Queue is Full.");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else {
            rear = rear + 1;
        }
        q[rear] = item;
    }

    static void qDelete() {
        if (front == -1) {
            System.out.println("Queue is Empty.");
            return;
        }
        System.out.println("Deleted element is : " + q[front]);
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = front + 1;
        }
    }

    static void qDisplay() {
        if (front == -1) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Queue Elements are : ");
        for (int i = front; i <=rear; i++) {
            System.out.println(q[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int item, op;
        do {
            System.out.println("1. Insertion : ");
            System.out.println("2. Deletion : ");
            System.out.println("3. Display : ");
            System.out.println("4. Exit : ");

            System.out.println("Enter an Option : ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Enter an item to be inserted : ");
                    item = sc.nextInt();
                    qInsert(item);
                    break;
                case 2:
                    qDelete();
                    break;
                case 3:
                    qDisplay();
                    break;
            }

        } while (op != 4);
        sc.close();
    }

}
