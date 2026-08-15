package DSA.Stacks;

import java.util.Stack;

class LongestValidParenthsis {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int Count =0;
        int maxCount =0;
        st.push(-1);
        for( int i =0 ; i<s.length();i++)
        {

            if( s.charAt(i)=='(')
            {
                st.push(i);

            }

            else
            {
                st.pop();
                if(st.isEmpty())

                {st.push(i);

                }
                else
                {


                    Count =i-st.peek();
                    maxCount =Math.max(Count,maxCount);
                }


            }

        }

        return maxCount;
    }
}