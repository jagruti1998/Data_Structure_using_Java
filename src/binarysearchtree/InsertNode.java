package binarysearchtree;
import java.util.Scanner;

class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;

    TreeNode1(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

class Solution1 {
    public TreeNode1 insertIntoBST(TreeNode1 root, int val) {
        if (root == null)
            return new TreeNode1(val);

        TreeNode1 cur = root;
        while (true) {
            if (cur.val <= val) {
                if (cur.right != null)
                    cur = cur.right;
                else {
                    cur.right = new TreeNode1(val);
                    break;
                }
            } else {
                if (cur.left != null)
                    cur = cur.left;
                else {
                    cur.left = new TreeNode1(val);
                    break;
                }
            }
        }

        return root;
    }
}

public class InsertNode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeNode1 root = null;
        Solution1 solution = new Solution1();

        System.out.print("Enter the number of nodes to insert: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value for node " + (i + 1) + ": ");
            int val = scanner.nextInt();
            root = solution.insertIntoBST(root, val);
        }

        System.out.println("Binary Search Tree created.");

        // You can perform other operations on the BST here.

        scanner.close();
    }
}
