package DSA.Stacks;

import java.util.Stack;

public class BaseballGame {


        public int calPoints(String[] operations) {
            Stack<Integer> s = new Stack<>();


            for( int i =0 ; i<operations.length;i++)
            {

                if( operations[i].equals("+"))
                {
                    int x=s.pop();
                    int y = s.peek();
                    int sum = x+y;
                    s.push(x);
                    s.push(sum);
                }
                else if(operations[i].equals("D"))
                {
                    int x = 2*s.peek();
                    s.push(x);
                }
                else if( operations[i].equals("C"))
                {
                    s.pop();
                }
                else
                {
                    s.push(Integer.parseInt(operations[i]));
                }
            }
            int sum = 0;
            while(!s.isEmpty())
            {
                sum = sum+s.pop();
            }

            return sum;
        }

    }

