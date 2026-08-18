package DSA.Stacks;

import java.util.Stack;

class NextGreater2 {
    public int[] nextGreaterElements(int[] nums) {

        Stack<Integer> st = new Stack<>();
        int [] nge = new int [nums.length];
        for(int i =2*(nums.length);i>=0;i--)
        {

            while(!st.isEmpty() && st.peek()<=nums[i%nums.length])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                nge[i%nums.length]=-1;
            }
            else
            {
                nge[i%nums.length]=st.peek();
            }

            st.push(nums[i%nums.length]);


        }

        return nge;
    }
}
