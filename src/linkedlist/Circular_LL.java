package linkedlist;

import java.util.Scanner;

public class Circular_LL {


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
        Node tail=null;//initially tail is null

        // taking values from user
        public void creation() {
            int data, n, m, p;
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Enter data");
                data = sc.nextInt();
                Node new_node = new Node(data);

                // if LL is Empty
                if (head == null)
                {
                    head = new_node;
                    tail=new_node;
                    new_node.next=head;
                }
                else {

                    new_node.next = head;
                    head = new_node;
                    tail.next=head;
                }


                System.out.println("Do you want to add more elements: If yes, press 1:");
                n = sc.nextInt();
            } while (n == 1);
        }

        // print list
        public void traverse() {
            Node temp=head;
            if (head == null) {
                System.out.println("List is empty");
            }
            else
            {
                do{
                    System.out.println(temp.data +" ");
                    temp=temp.next;
                }
                while (temp!=head);
            }
            }



        public static void main(String[] args) {
            Circular_LL ll = new Circular_LL();
            ll.creation();
            ll.traverse();
        }
    }
