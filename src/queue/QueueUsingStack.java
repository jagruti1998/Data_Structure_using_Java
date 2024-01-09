package queue;

import java.util.Stack;

public class QueueUsingStack {

    Stack<Integer> in,out;

    public QueueUsingStack() {
        in=new Stack<>();
        out=new Stack<>();

    }

    public void push(int x) {
        in.push(x);

    }

    public int pop() {
        peek();
        return out.pop();


    }

    public int peek() {
        if(out.empty()){
            while(!in.empty())
            {
                out.push(in.pop());
            }
        }
        return out.peek();

    }

    public boolean empty() {
        return in.empty() && out.empty();


    }
}


