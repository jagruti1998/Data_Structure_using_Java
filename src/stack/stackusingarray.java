package stack;

public class stackusingarray {
    int arr[]=new int[5];
    int top=-1;

    void push(int x){
        if(top==arr.length-1)
        {
            System.out.println("Check stack is full");
        }
        else {
            arr[++top]=x;
            System.out.println("element pushed");
        }
    }


    void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            top--;
            System.out.println("element removed");
        }

    }

    int top(){
        return arr[top];
    }

    int size(){
        return top+1;
    }

    boolean isEmpty(){
        return (top==-1);
    }


}
