package DSA.LinkedList;

public class CheckIfCircular {
    class CheckifCircular {
        boolean isCircular(Node head) {
            // code here
            Node temp = head ;
            while( temp.next!=head && temp.next !=null)
            {
                temp=temp.next;
            }
            if( temp.next==head)
            {
                return true;
            }
            return false;
        }
    }
}
