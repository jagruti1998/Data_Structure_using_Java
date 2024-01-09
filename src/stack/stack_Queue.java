package stack;

import java.util.LinkedList;
import java.util.Queue;

public class stack_Queue {
    Queue<Integer> q1,q2;

    public stack_Queue(){
        q1=new LinkedList<>();
        q2=new LinkedList<>();

    }

    public void push(int x){
        while(!q1.isEmpty()){
            q2.add(q1.poll());

        }
        q1.add(x);

        while(!q2.isEmpty()){
            q1.add(q2.poll());
        }

    }

    public int pop(int x){
        return q1.poll();
    }

    public int top(){
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();

    }

}
