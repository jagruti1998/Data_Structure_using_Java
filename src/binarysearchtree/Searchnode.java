package binarysearchtree;
import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null && root.val != val) {
            root = val < root.val ? root.left : root.right;
        }
        return root;
    }
}

public class Searchnode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input tree values as an array
        int[] values = { 4, 2, 7, 1, 3, 6, 9 }; // Modify this array as needed

        TreeNode root = buildBST(values);

        System.out.print("Enter the value to search in the BST: ");
        int targetValue = scanner.nextInt();

        Solution solution = new Solution();
        TreeNode result = solution.searchBST(root, targetValue);

        if (result != null) {
            System.out.println("Found the value " + targetValue + " in the BST.");
        } else {
            System.out.println("Value " + targetValue + " not found in the BST.");
        }

        scanner.close();
    }

    public static TreeNode buildBST(int[] values) {
        TreeNode root = null;
        for (int val : values) {
            root = insertIntoBST(root, val);
        }
        return root;
    }

    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else if (val > root.val) {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
}
