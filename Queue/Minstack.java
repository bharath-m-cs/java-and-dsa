package DSA.Queue;

import java.util.Stack;

public class Minstack{


    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();


    public void push(int x) {

        s1.push(x);
        if( s2.isEmpty() || x<=s2.peek())
        {
            s2.push(x);

        }
    }

    public void pop() {

        int x = s1.pop();


        if(  !s2.isEmpty() && x== s2.peek())
        {
            s2.pop();
        }
    }

    public int peek() {

        if(s1.isEmpty())
        {
            return -1;
        }
        return s1.peek();
    }

    boolean isEmpty() {

        if(s1.isEmpty())
        {
            return true;
        }
        return false;
    }

    public int getMin() {

        if(s2.isEmpty())
        {
            return - 1;
        }
        return s2.peek();
    }
}
