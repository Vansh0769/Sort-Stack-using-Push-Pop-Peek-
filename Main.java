package com.company;

import java.util.Scanner;

public class Main {
    int[] arr1 = new int[100];
    int n, x;
    int top = -1;

    void push() {
        if (top >= n - 1) {
            System.out.println("Stack array is overflow");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value to be pushed: ");
            x = sc.nextInt();
            top++;
            arr1[top] = x;
        }
    }


    void pop() {
        if (top <= -1) {
            System.out.println("Stack is underflow");
        } else {
            System.out.println("The popped element is " + arr1[top]);
            top--;
        }
    }


    void display() {
        if (top >= 0) {
            System.out.println("The elements in STACK are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr1[i]);
            }
        } else {
            System.out.println("The stack is empty");
        }
    }


    void sortStack() {

        for (int i = 0; i <= top; i++) {  // This loop will only select the position of the element
            for (int j = i + 1; j <= top; j++) { // This loop will work to sort elements in ascending order
                if (arr1[i] > arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main stack = new Main();

        System.out.println("Enter the maximum size of the stack: ");
        stack.n = sc.nextInt();

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display Stack");
            System.out.println("4. Sort Stack");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    stack.push();
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    stack.sortStack();
                    System.out.println("Stack after sorting:");
                    stack.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);
    }
}
