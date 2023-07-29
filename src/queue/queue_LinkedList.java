package queue;

import java.util.Scanner;

public class queue_LinkedList {

    class queue1 {

        static class Node //static because we don't need to create object of this class
        {    //inner class
            int data;
            Node next;

            Node(int data) //constrcutor

            {
                this.data = data; //to initialise the initial value of variables in the class
                this.next = null;

            }
        }

        Node f = null;//initially top is null
        Node r = null;


        //push
        void enqueue(Scanner sc) {
            System.out.println("Enter data");
            int data = sc.nextInt();
            Node new_node = new Node(data);
            if (f == null) {
                f = new_node;
                r = new_node;
            } else {
                r.next = new_node;
                r = new_node;
            }
        }

        void dequeue() {
            if (f == null) {
                System.out.println("underflow");
            } else {
                f = f.next;
            }
        }


        void display() {
            Node temp = f;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

    }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            queue_LinkedList q = new queue_LinkedList(); // Create an instance of the outer class
            queue1 s = q.new queue1(); // Create an instance of the inner class
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

                System.out.println("Enter 1 to go back to the main menu");
                System.out.println("Enter any key to exit");

                l = sc.nextInt();
            } while (l == 1); // Corrected loop condition to continue when l is 1
            System.out.println("exit");
        }
    }