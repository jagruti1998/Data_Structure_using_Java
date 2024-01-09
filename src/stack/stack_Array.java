package stack;

import java.util.Scanner;

class stack {
    int n = 10; // max size
    int top = -1;
    int a[] = new int[n]; // array

    void push(Scanner sc) {
        if (top == (n - 1)) {
            System.out.println("Overflow");
        } else {
            System.out.println("Enter data");
            int i = sc.nextInt();
          //  top = top + 1;
          //  a[top] = i;
            a[++top]=i;

            System.out.println("Item inserted");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Underflow");
        } else {
           // top = top - 1;
            top--;
            System.out.println("Item deleted");
        }
    }

    void display() {
        System.out.println("Display items here:");
        for (int j = top; j >= 0; j--) {
            System.out.print(a[j] + " ");
        }
        System.out.println(); // Move to the next line after displaying all items
    }
}

public class stack_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack s = new stack();
        int d;
        int l;

        do {
            System.out.println("Press 1 to push");
            System.out.println("Press 2 to pop");
            System.out.println("Press 3 to display");
            System.out.println("Enter your choice");
            d = sc.nextInt();
            switch (d) {
                case 1: {
                    s.push(sc);
                    break;
                }
                case 2: {
                    s.pop();
                    break;
                }
                case 3: {
                    s.display();
                    break;
                }
            }

            System.out.println("Enter 0 to go back to main menu");
            System.out.println("Enter any key to exit");

            l = sc.nextInt();
        }
        while (l==0);
        System.out.println("exit");
        }
    }

