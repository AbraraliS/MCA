package StackQueue;

import java.util.Scanner;

public class Stack {
    static int size = 4, top = -1;
    static int[] arr = new int[size];

    static void push(int item) {
        if (top == size - 1) {
            System.out.println("Stack is overflow.");
            return;
        }
        top++;
        arr[top] = item;
    }

    static void pop() {
        if (top == -1) {
            System.out.println("Stack is underflow.");
            return;
        }
        System.out.println("Deleted Element is : " + arr[top]);
        top--;
    }

    static void display() {
        if (top == -1) {
            System.out.println("Stack is empty ");
            return;
        }
        System.out.println("The stack elements are : ");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int item, op;
        do {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            System.out.println("Enter an Option: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Enter an item to be pushed: ");
                    item = sc.nextInt();
                    push(item);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        } while (op != 4);
        sc.close();
    }
}
