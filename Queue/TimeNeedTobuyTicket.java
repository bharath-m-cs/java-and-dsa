package DSA.Queue;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {



        Queue<int []> s = new LinkedList<>();

        for( int i =0 ; i<tickets.length;i++)
        {
            s.offer(new int []{tickets[i],i});
        }

        int count =0 ;
        while (!s.isEmpty()) {

            int[] person = s.peek();

            person[0]--;
            count++;

            if (person[1] == k && person[0] == 0) {
                break;
            }

            s.remove();

            if (person[0] > 0) {
                s.add(person);
            }
        }
        return count;

    }
}