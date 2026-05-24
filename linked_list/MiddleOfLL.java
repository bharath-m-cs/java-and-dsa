package DSA.LinkedList;

public class MiddleOfLL {


    static  Node head = null;
    static  Node tail = null;
    static  void insertAtBeginning ( int data )
    {
        Node beginNode = new Node(data );

        beginNode.next = head ;
        head= beginNode;
        if( tail == null)
        {

            tail = beginNode;
        }


    }

    static  void insertatEnd( int data )   // here suing traversal and inserting
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



    static  Node  middle()
    {
        Node temp = head ;
        int count =0;

        while( temp!= null)
        {
            count++;

            temp = temp.next;
        }
int mid = ( count /2)+1;

        temp = head ;
        int currPos = 1 ;
        while( currPos<mid)
        {temp = temp.next;
            currPos++;
        }
        return temp;
    }

        static Node  middleNode() { // using hare and tortoise algo

            Node slow = head ;
          Node fast = head;


            while( fast != null && fast.next != null)
            {
                slow = slow.next;
                fast = fast.next.next;


            }
            return slow ;
        }

    public static void main(String[] args) {



        insertatEnd(1);
        insertatEnd(2);
        insertatEnd(3);
        insertatEnd(4);
        insertatEnd(5);
        traverse();
        Node mid = middle();
        System.out.println(mid.data);
    }
}
