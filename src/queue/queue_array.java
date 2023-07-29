package queue;

import java.util.Scanner;
public class queue_array {

    static class queue {
        int f = -1, r = -1;
        int n = 10;
        int q[] = new int[10];

        void enqueue(Scanner sc) {

            if (r == (n - 1)) {
                System.out.println("Overflow condition");
            } else {
                System.out.println("Enter data");
                int i = sc.nextInt();
                if (f == -1 && r == -1) {
                    f = 0;
                    r = 0;
                    q[r] = i;
                } else {
                    r = r + 1;
                    q[r] = i;
                }
            }
        }

        void dequeue() {
            if (f == -1 && r == -1) {
                System.out.println("underflow");
            } else {
                f = f + 1;
            }
        }

        void display() {
            System.out.println("Items are: ");
            for (int i = f; i <= r; i++) {
                System.out.println(q[i]);
            }

        }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            queue s = new queue();
            int d;
            int l;

            do {
                System.out.println("Press 1 to enqueue");
                System.out.println("Press 2 to dequeue");
                System.out.println("Press 3 to display");
                System.out.println("Enter your choice");
                d = sc.nextInt();
                switch (d) {
                    case 1: {
                        s.enqueue(sc);
                        break;
                    }
                    case 2: {
                        s.dequeue();
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
            while (l == 0);
            System.out.println("exit");
        }
    }



