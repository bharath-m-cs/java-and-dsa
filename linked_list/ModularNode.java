package DSA.LinkedList;

class Solution {
    public int modularNode(Node head, int k) {

        Node temp = head;
        int currpos=1;
        int mod =-1;
        while(temp!=null)
        {
            if(currpos %k==0)
            {mod =temp.data;

            }
            currpos++;
            temp = temp.next;
        }
        if(mod==-1)
        {
            return -1;
        }
        else
        {
            return mod;
        }
    }
}