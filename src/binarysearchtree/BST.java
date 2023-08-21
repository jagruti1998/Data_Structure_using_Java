package binarysearchtree;

public class BST {

    static class Node {   //basic node structure
        int data;
        Node left;
        Node right;


    Node(int data) {
        this.data = data;
    }

}

    public static Node insert(Node root,int value){ //insert function to insert values into bst
        //basic condition
        if(root==null){
            root=new Node(value);
            return root;
        }
        //comparison
        if(root.data>value){
            //left subtree
            root.left=insert(root.left,value);
        }


        else
        {
            //right subtree
            root.right=insert(root.right,value);
        }
        return root;
    }

    //to verify tree is build properly
    public static void inorder(Node root){    //T(C)-O(H)
        //base condition
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data     +"");
        inorder(root.right);
    }


    //search node in a bst
    public static boolean search(Node root,int key){  // LOG(n)
        //comparison

        if(root==null){
            return false;
        }
        if(root.data>key){ //left subtree
            return search(root.left,key);
        }

        else if(root.data==key){
            return true;
        }

        else
        {//right subtree
            return search(root.right,key);
        }

    }

    public static void main(String[] args)
    {
        int values[]={5,1,3,4,2,7};//values to build bst
        Node root=null; //initially root is null

        //loop for traverse the whole values array
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }

        inorder(root);
        System.out.println();

        if(search(root,8)){
            System.out.println("found");
        }
        else
        {
            System.out.println("not found");
        }
    }

}
