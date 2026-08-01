package DSA.DoubleLL;

public class DllOperations {

private static Node head ;
private static  Node tail;


    static  Node insertAtbegin( int data )
    {
        Node newNode = new Node(data);

// if list is empty
        if( head == null )
        {

            head.next = newNode;
            tail= newNode ;
            return head ;
        }
// already list has some elements
        newNode.next = head ;
        head.prev = newNode;
        head = newNode;
return head ;

    }


    static  void traverse ()
    {
        Node temp;
        if( head == null)
        {
            System.out.println(" empty list ");
        }
        else
        {

            temp = head ;
            while( temp.next  != null)
            {

                temp = temp.next ;
            }


        }
    }



    public static void main(String[] args) {

    }
}
