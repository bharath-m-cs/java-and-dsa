package DSA.Queue;

import java.util.Stack;

class ImplementQueueUisngStack{


    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public ImplementQueueUisngStack() {

    }

    public void push(int x) {


        s1.push(x);
    }

    public int pop() {
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
        int re = s2.pop();
        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }


        return re;
    }

    public int peek() {

        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
        int re = s2.peek();
        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }

        return re;

    }

    public boolean empty() {
        return s1.isEmpty();
    }
}


