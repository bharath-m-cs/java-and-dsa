package DSA.LinkedList;

class KthfromLL {
    public int getKthFromLast(Node head, int k) {

        Node temp = head ;
        int length =1;
        while(temp !=null)
        {
            length++;
            temp=temp.next;
        }
        temp = head ;
        int curr=1;



        if(k< length)
        {
            while(curr<length-k)
            {temp = temp.next;
                curr++;

            }

            return temp.data;
        }
        return -1;

    }
}