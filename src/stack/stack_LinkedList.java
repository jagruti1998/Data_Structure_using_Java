package stack;

import linkedlist.Single_LL;

import java.util.Scanner;

class stack1{

    static class Node //static because we don't need to create object of this class
    {    //inner class
        int data;
        Node next;

        Node(int data) //constructor

        {
            this.data = data; //to initialise the initial value of variables in the class
            this.next = null;

        }
    }
        Node top=null;//initially top is null


    //push
    void push(Scanner sc)
    {
        System.out.println("Enter data");
        int data =sc.nextInt();
        Node new_node=new Node(data);
        if(top==null)
        {
            top=new_node;
        }
        else
        {
            new_node.next=top;
            top=new_node;
        }
    }

    void pop(){
        if(top==null)
        {
            System.out.println("stack is empty");
        }
        else
        {
            top=top.next;
        }
        }

        void display(){
        Node temp=top;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        }
    }







public class stack_LinkedList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack1 s = new stack1();
        int d;
        int l;

        do {
            System.out.println("Press 1 to push");
            System.out.println("Press 2 to pop");
            System.out.println("Press 3 to display");
            System.out.println("Enter your choice");
            d = sc.nextInt();
            switch (d) {
                case 1: {
                    s.push(sc);
                    break;
                }
                case 2: {
                    s.pop();
                    break;
                }
                case 3: {
                    s.display();
                    break;
                }
            }

            System.out.println("Enter 0 to go back to main menu");
            System.out.println("Enter any key to exit");

            l = sc.nextInt();
        }
        while (l==0);
        System.out.println("exit");
    }
}

