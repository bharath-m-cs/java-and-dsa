package DSA.LinkedList;


import java.util.ArrayList;

class minmaMaxima{
    public int[] nodesBetweenCriticalPoints(Node head) {



        Node prev = head ;
        Node temp = head.next ;
        ArrayList<Integer> s =new ArrayList<>();


        int position =2;
        int count =0;
        while(  temp.next!=null)
        {
            Node nextNode = temp.next;

            if( temp.data <prev.data && temp.data<nextNode.data ||temp.data >prev.data && temp.data >nextNode.data  )
            {
                s.add(position);
                count++;

            }

            position++;
            prev = temp;
            temp = temp.next;
        }
        int mini = Integer.MAX_VALUE;



        if(count<2 )
        {
            return new int []{-1,-1};
        }

        for( int i =1 ; i<s.size();i++ )
        {
            int dist =s.get(i)-s.get(i-1);
            mini = Math.min(mini , dist );


        }

        int maxi = s.get(s.size()-1)-s.get(0);


        return new int []{mini,maxi};

    }
}