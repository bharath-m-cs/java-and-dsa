package DSA.Stacks;

import java.util.ArrayList;
import java.util.Stack;

public class previousGreaterelement {



        public ArrayList<Integer> preGreaterEle(int[] arr) {

            ArrayList<Integer> s = new ArrayList<>();






            Stack<Integer> st = new Stack<>();

            for( int i =0 ;i<arr.length;i++)
            {
                while( !st.isEmpty() && st.peek()<=arr[i])
                {

                    st.pop();
                }


                if( st.isEmpty())
                {
                    s.add(-1);
                }

                else
                {
                    s.add(st.peek());

                }
                st.push(arr[i]);
            }


            return s;

        }
    }
