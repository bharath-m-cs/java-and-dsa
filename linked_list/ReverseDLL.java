package DSA.DoubleLL;

public class ReverseDLL {

    static  Node head = null;

    // reverse logic for DLL
    static Node reverse(Node head) {
        Node temp = head ;
        Node prev = null;
        while( temp !=null)
        {
            Node nextnode = temp.next;
            temp.next= prev;
            temp.prev=nextnode;
            prev=temp;
            temp=nextnode;

        }
        head = prev;
        return head  ;
    }


    // 2. traversal method
    static void  reverse ( )
    {
        Node temp = head ;
        while( temp.next !=null)
        {
            temp = temp.next;
        }

        while( temp!=null)
        {
            System.out.print(temp.data+ " ");
            temp = temp.prev;
        }



    }


    public static void main(String[] args) {

    }
}