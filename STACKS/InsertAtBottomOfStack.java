package DSA.Stacks;

import java.util.Stack;

class InsertAtBottomOfStack{
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        // code here
        Stack<Integer> s2 = new Stack<>();
        while(!st.isEmpty())
        {
            s2.push(st.pop());
        }

        st.push(x);
        while(!s2.isEmpty())
        {
            st.push(s2.pop());
        }

        return st;
    }
}