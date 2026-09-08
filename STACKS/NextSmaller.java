package DSA.Stacks.Monotonic;

import java.util.ArrayList;
import java.util.Stack;

class NextSmaller {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {


        ArrayList<Integer> list = new ArrayList<>();

        Stack<Integer> st = new Stack<>();


        for(int i =0 ; i<arr.length;i++)
        {
            list.add(-1);
        }

        for(int i = arr.length-1;i>=0;i--)
        {


            while(!st.isEmpty() && st.peek()>=arr[i])
            {
                st.pop();
            }


            if( st.isEmpty())
            {
                list.set(i,-1);
            }
            else
            {
                list.set(i,st.peek());
            }


            st.push(arr[i]);
        }
        return list;
    }
}