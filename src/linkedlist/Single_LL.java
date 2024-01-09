package linkedlist;

import java.util.Scanner;

public class Single_LL {
    //Node Structure
    static class Node //static because we don't need to create object of this class
    {
        int data;
        Node next;

        Node(int data) //constructor

        {
            this.data=data; //to initialise the initial value of variables in the class
            this.next=null;

        }
    }
    Node head=null;//initially head is null

     //taking values from user
     public void creation(){
    int data,n;
         Scanner sc=new Scanner(System.in);
         do {
             System.out.println("ENter data");
             data = sc.nextInt();
             Node new_node = new Node(data);

             //insertion of node in Singly LL

             //if LL is Empty
             if (head == null) {
                 head = new_node; //10

             } else { //If LL exist
                 new_node.next = head;
                 head = new_node;   //  30 20 10
             }

             System.out.println("Do you want to continue: If yes, press 1:");
             n = sc.nextInt();
         }
         while (n==1);
}

//print list
    public void traverse(){

    if(head==null) {
        System.out.println("List is empty");
        return;
    }
    Node currNode=head;
    while(currNode!=null)
    {
        System.out.println(currNode.data );
        currNode=currNode.next;
    }
        System.out.println("null");

}
    public static void main(String[] args)
    {
        Single_LL ll=new Single_LL();
        ll.creation();
        ll.traverse();
    }


}