package binarysearchtree;

import javax.swing.plaf.PanelUI;

public class BST {

    static class Node {   //basic node structure
        int data;
        Node left;
        Node right;


        Node(int data) {
            this.data = data;
        }

    }

    public static Node insert(Node root, int value) { //insert function to insert values into bst
        //basic condition
        if (root == null) {
            root = new Node(value);
            return root;
        }
        //comparison
        if (root.data > value) {
            //left subtree
            root.left = insert(root.left, value);
        } else {
            //right subtree
            root.right = insert(root.right, value);
        }
        return root;
    }

    //to verify tree is build properly
    public static void inorder(Node root) {    //T(C)-O(H)
        //base condition
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data + "");
        inorder(root.right);
    }


    //search node in a bst
    public static boolean search(Node root, int key) {  // LOG(n)
        //comparison

        if (root == null) {
            return false;
        }
        if (root.data > key) { //left subtree
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {//right subtree
            return search(root.right, key);
        }

    }

    //delete node
    public static Node delete(Node root, int value) {

        //search node
        if (root.data > value) {
            root.left = delete(root.left, value);
        } else if (root.data < value) {
            root.right = delete(root.right, value);
        } else {  //root.data==value
            //case1
            if (root.left == null && root.right == null) {
                return null;
            }

            //case2
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            //case3
            Node IS = inorderSuccessor(root.right); //found is data
            root.data = IS.data; //attach is data to root
            root.right = delete(root.right, IS.data); //delete is data

        }
        return root;

    }

    public static Node inorderSuccessor(Node root) {
        while (root.left != null) { //until we find left most child in right
            root = root.left;
        }
        return root;

    }

    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};//values to build bst
        Node root = null; //initially root is null

        //loop for traverse the whole values array
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        delete(root, 5);
        inorder(root);

   /*     if(search(root,8)){
            System.out.println("found");
        }
        else
        {
            System.out.println("not found");
        }
    */

    }
}