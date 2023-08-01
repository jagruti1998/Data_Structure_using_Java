package tree;

import java.util.Scanner;

public class tree_creation {

    static Node create() //create function to take values from user
    {
        int data;

        Scanner sc = new Scanner(System.in);
        Node root = null;//initially root is null

        System.out.println("Enter value ");//root node 10
        data = sc.nextInt();//value from user is stored in data

        if (data == -1) {
            return null;
        }
            root = new Node(data);//value entered will be assigned to root

            System.out.println("Enter left child of " + root.data);
            root.left = create();//recursion function

             

            return root;
        }


        public static void main (String[]args){
        Node root = create();

    }
    }



        //Basic node structure of binary tree in linked list
        class Node {
            Node left, right;
            int data;

            public Node(int data) {
                this.data = data;
                left = null;
                right = null;
            }
        }
