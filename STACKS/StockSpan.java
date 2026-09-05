package DSA.Stacks.Monotonic;

import java.util.Stack;

class StockSpan {


    Stack<int[]> st = new Stack<>();

    int index = 0;



    public int next(int price) {


        while (!st.isEmpty() && st.peek()[0] <= price) {
            st.pop();
        }

        int span;

        if (st.isEmpty()) {
            span = index + 1;
        }
        else {

            span = index - st.peek()[1];
        }

        st.push(new int[]{price, index});

        index++;

        return span;
    }
}