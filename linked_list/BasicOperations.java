package DSA.LinkedList;

public class BasicOperations {

    static  Node head = null;
 static  void insertAtBeginning ( int data )
{
    Node beginNode = new Node(data );

    beginNode.next = head ;
    head= beginNode;



}
static  void traverse()
{
    if(head == null)
    {
        System.out.print(" LInkedList is Empty ");

    }

    else
    {
        Node temp = head ;
        while(temp!=null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }
}


static  void insertatEnd( int data )
{
    Node endNode = new Node(data);

    Node temp = head ;

    if( head == null)
    {
        insertAtBeginning(data);
    }
    else
    {
        while( temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = endNode;

    }



}







    public static void main(String[] args) {

        insertAtBeginning(3);
        insertAtBeginning(4);
        insertAtBeginning(5);
        traverse();
        System.out.println(" after changes ");
        insertatEnd(2);
        traverse();
    }
}
