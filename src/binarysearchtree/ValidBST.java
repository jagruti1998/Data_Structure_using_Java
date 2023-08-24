package binarysearchtree;

public class ValidBST {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) { this.val = val; }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValid(TreeNode root, long min, long max) {  //time complexity is O(n):
        if (root == null) return true;
        if (root.val >= max || root.val <= min) {
            return false;
        }
        return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
    }

    public static void main(String[] args) {
        // Create a binary tree
        ValidBST validBST = new ValidBST(); // Create an instance of ValidBST
        TreeNode root = validBST.new TreeNode(2); // Use validBST.new to create TreeNode
        root.left = validBST.new TreeNode(1); // Use validBST.new to create TreeNode
        root.right = validBST.new TreeNode(3); // Use validBST.new to create TreeNode

        // Check if the tree is a valid BST
        boolean isValid = validBST.isValidBST(root);

        // Print the result
        System.out.println("Is the tree a valid BST? " + isValid);
    }
}
