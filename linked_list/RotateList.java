package DSA.LinkedList;

public class RotateList{
    public Node rotateRight(Node head, int k) {

        if(head == null || head.next == null)
            return head;

        int n=0 ;
        Node temp = head;
        while( temp !=null)
        {
            n++;
            temp=temp.next;
        }

        k=k%n;


        while( k>0)
        {
            temp = head ;
            Node prev =null;

            while( temp.next !=null)
            {
                prev= temp;
                temp = temp.next ;

            }
            Node tail = temp;
            tail.next=head;
            prev.next=null;
            head = tail;

            k--;
        }
        return head;
    }
}
