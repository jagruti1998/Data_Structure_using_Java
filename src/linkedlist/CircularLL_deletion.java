package linkedlist;

import java.util.Scanner;

public class CircularLL_deletion {

        // Node Structure
        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        Node head = null; // initially head is null
        Node tail = null;// initially tail is null

        // taking values from user
        public void creation() {
            int data, n, m, p;
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Enter data");//10
                data = sc.nextInt();
                Node new_node = new Node(data);

                // if LL is Empty
                if (head == null) {
                    head = new_node;
                    tail = new_node;
                    new_node.next = head;
                } else {
                    System.out.print("Enter 1 to insert the data at first, 2 to insert at last , 3 at loc");
                    m = sc.nextInt();
                    switch (m) {
                        case 1:
                            new_node.next = head;
                            head = new_node;
                            tail.next = head;
                            break;

                        case 2:
                            tail.next = new_node;
                            tail = new_node;
                            tail.next = head;
                            break;

                        case 3:
                            System.out.println("Enter position of node to be inserted: ");
                            p = sc.nextInt();
                            Node temp1 = head;
                            for (int i = 0; i < (p - 1); i++) {
                                temp1 = temp1.next;
                            }
                            new_node.next = temp1.next;
                            temp1.next = new_node;
                            break;
                    }
                }

                System.out.println("Do you want to add more elements: If yes, press 1:");
                n = sc.nextInt();
            } while (n == 1);
        }

    public void delete() {
        int data, n, m, p;
        Scanner sc=new Scanner(System.in);
        do {
            if(head==null) {
                System.out.println("LL is empty");//10
            }
            else {
                System.out.println("Enter 1 to delete from beginning, 2 to delete from last , 3 to delete from loc");
                m=sc.nextInt();
                switch (m) {
                    case 1:
                        Node temp=head;
                        temp= temp.next;
                        head=temp;
                        tail.next=head;
                        break;

                    case 2:
                        Node temp1=head;
                        Node ptr=temp1.next;
                        while (ptr.next!=null) {
                            temp1 = ptr;
                            ptr = ptr.next;
                        }
                        temp1.next=head;
                        tail=temp1;
                        break;

                    case 3:
                        System.out.println("Enter position of node to be deleted");
                        p= sc.nextInt();
                        Node temp2=head;
                        Node ptr1=temp2.next;
                        for(int i=0;i<p-1;i++)
                        {
                            temp2 = ptr1;
                            ptr1 = ptr1.next;
                        }
                        temp2.next=ptr1.next;
                        break;


                }
            }
            System.out.println("Do you want to delete more : If yes, press 1:");
            n = sc.nextInt();
        }
        while (n == 1);
    }


    // print list
        public void traverse() {
            if (head == null) {
                System.out.println("List is empty");
            } else {
                Node temp = head;
                while (temp.next != head) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
                System.out.print(temp.data + " "); // Print the last node's data
                System.out.println(); // Move to the next line
            }
        }

        public static void main(String[] args) {
            CircularLL_deletion ll = new CircularLL_deletion();
            ll.creation();
            ll.delete();
            ll.traverse();
        }
    }

