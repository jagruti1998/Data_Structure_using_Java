package tree;

import java.util.Scanner;

public class tree_traversal {

    static Node create() {
        int data;

        Scanner sc = new Scanner(System.in);
        Node root = null;

        System.out.println("Enter value (-1 to stop): ");
        data = sc.nextInt();

        if (data == -1) {
            return null;
        }
        root = new Node(data);

        System.out.println("Enter left child of " + root.data);
        root.left = create();

        System.out.println("Enter right child of " + root.data);
        root.right = create();

        return root;
    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " "); // Print node data with a space
        inorder(root.right);
    }

    static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " "); // Print node data with a space
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " "); // Print node data with a space
    }

    static Node get(Node root, int target) { //to find the value in the tree
        if (root == null) {
            return null; // The target value is not present in the tree
        }

        if (root.data == target) {
            return root; // Found the target value at the current node
        }

        // Recursively search in the left and right subtrees
        Node leftResult = get(root.left, target);
        Node rightResult = get(root.right, target);

        // Return the result from either the left or right subtree
        return leftResult != null ? leftResult : rightResult;
    }


    //to get minimum of tree
    // ... (existing code)

    static int getMin(Node root) {
        if (root == null) {
            throw new IllegalArgumentException("The tree is empty.");
        }

        while (root.left != null) {
            root = root.left;
        }

        return root.data;
    }

    //to get maximum of tree

    static int getMax(Node root) {
        if (root == null) {
            throw new IllegalArgumentException("The tree is empty.");
        }

        while (root.right != null) {
            root = root.right;
        }

        return root.data;
    }

    

    public static void main(String[] args) {
        Node root = create();
        System.out.print("Preorder Traversal: ");
        preorder(root);
        System.out.println(); // Add a newline after preorder traversal
        System.out.print("Postorder Traversal: ");
        postorder(root);
        System.out.println(); // Add a newline after postorder traversal
        System.out.print("Inorder Traversal: ");
        inorder(root);
        System.out.println(); // Add a newline after inorder traversal


        //to find the value in the tree
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to search: ");
        int targetValue = sc.nextInt();

        Node result = get(root, targetValue);
        if (result != null) {
            System.out.println("Found the value " + targetValue + " in the tree.");
        } else {
            System.out.println("The value " + targetValue + " is not present in the tree.");
        }


        //min and max of tree
        int minValue = getMin(root);
        int maxValue = getMax(root);

        System.out.println("Minimum value in the tree: " + minValue);
        System.out.println("Maximum value in the tree: " + maxValue);


        }
}

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
