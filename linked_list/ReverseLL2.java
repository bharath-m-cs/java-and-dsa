package DSA.LinkedList;

public class ReverseLL2 {



    public Node reverseBetween(Node head, int left, int right) {

        Node temp = head ;
        int curr = 1;
        Node prefix = null;

        while( curr < left )
        {    prefix = temp ;
            temp = temp.next;
            curr++;
        }
        Node tail = temp;
        Node prev = null;
        while( curr<= right)
        {
            Node nextNode = temp.next;
            temp.next = prev;
            prev = temp ;
            temp = nextNode;
            curr++;
        }

        if( prefix !=null)
        { prefix.next = prev;}
        else
        {
            head = prev;
        }

        tail.next = temp ;




        return head ;




    }
}
