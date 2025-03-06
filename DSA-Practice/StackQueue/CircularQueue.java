package StackQueue;

import java.util.Scanner;

public class CircularQueue {
    static int size = 4;
    static int[] cq = new int[size];
    static int front = -1;
    static int rear = -1;

    static void qInsert(int item) {
        if (((front == 0) && rear == size - 1) || (front == rear + 1)) {
            System.out.println("Queue is full.");
            return;
        }
        if (front == -1) {
            rear = 0;
            front = 0;
        } else if (rear == size - 1) {
            rear = 0;
        } else {
            rear++;
        }
        cq[rear] = item;
    }

    static void qDelete() {
        if (front == -1) {
            System.out.println("Queue is Empty.");
            return;
        }
        System.out.println("Deleted element is : " + cq[front]);
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front++;
        }
    }

    static void qDisplay() {
        if (front == -1) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Elements of CircularQueue is :");
        if (front <= rear) {
            for(int i = front; i <= rear; i++){
                System.out.println(cq[i]);
            }
        }
        else {
            for(int i = front; i <= size - 1; i++) {
                System.out.println(cq[i]);
            }
            for(int i = 0; i <= rear; i++){
                System.out.println(cq[i]);
            }
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
