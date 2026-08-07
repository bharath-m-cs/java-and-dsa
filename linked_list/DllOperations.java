package DSA.DoubleLL;

public class DllOperations {

private static Node head ;
private static  Node tail;






static Node deletefrombeg()
{
    if( head==null)
    {
        System.out.println(" list is empty ");
        return head;
    }

    if( head.next==null)
    {
       head=null;
       tail=null;
       return head ;
    }


    Node prev = head;
    head =head.next;
    head.prev=null;
    prev.next=null;
    return head ;

}

static Node deletefroend()
{


    if( head==null)
    {
        System.out.println(" list is empty ");
        return head;
    }

    if (head.next==null)
    {
        head=null;
        tail=null;
        return head ;
    }
    Node temp = head ;
    while( temp.next!=null)
    {
        temp=temp.next;
    }

    Node prev=temp.prev;
    prev.next=null;
    temp.prev=null;

    return head ;
}

static  Node deletfrompos(int pos)
{
    if( head == null)
    {
        System.out.println(" list is empty , so cant delete");
        return head;
    }
    if( pos==1)
    {
        return deletefrombeg();
    }

    Node temp = head ;
    int currpos=1;
    while( temp !=null)
    {
        if(currpos == pos)
        {
            break;
        }

        temp = temp.next;
        currpos++;
    }


    if( temp==null)
    {
        System.out.println(" cant delete ");
        return head ;
    }

    Node prevNode =temp.prev;
    Node nextNode =temp.next;

    prevNode.next = temp.next;
    if(nextNode !=null)
    {
        nextNode.prev=prevNode;
        temp.next=null;
    }

    temp.prev=null;
    return head ;

}

static Node deleteValue(int val)
{

    if(head==null)
    {
        System.out.println("cant delete");
        return head;
    }

    if( head.data==val)
    {
        return deletefrombeg();
    }
    Node temp = head ;
    while( temp !=null && temp.data!=val)
    {
        temp = temp.next;
    }
    Node prevNode = temp.prev;
    prevNode.next=temp.next;
    if(temp.next!=null)
    {
        temp.next.prev=prevNode;
        temp.next=null;
    }
    temp.prev=null;
    return head ;
}

    static  Node insertAtbegin( int data )
    {
        Node newNode = new Node(data);

// if list is empty
        if( head == null )
        {

            head = newNode;
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
            while( temp  != null)
            {
                System.out.println(temp.data);
                temp = temp.next ;
            }


        }
    }



    static Node insertAtEnd(int data)
    {
        Node newNode = new Node(data);


        if( head == null)
        {
            head = newNode;
            tail= newNode;

        }
else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
return head ;
    }

    static Node insertafterValue(int data, int value)
    {
        if( head == null)
        {
            System.out.println(" no such value found");
            return head;
        }

        Node newNode = new Node(data);
        Node temp = head;
        while (temp !=null && temp.data!=value)
        {
            temp = temp.next;
        }
        if( temp==null)
        {
            System.out.println(" no such value");
            return head ;
        }

        if( temp == tail)
        {
           return  insertAtEnd(data);
        }

        Node nextNode;
        nextNode= temp.next;

        newNode.next=nextNode;
        nextNode.prev=newNode;

        newNode.prev=temp;
        temp.next=newNode;

        return head ;
    }



    static  Node insertatPosition(int data, int pos)
    {
        if( pos<=0)
        {
            System.out.println(" not a valid position");
            return head;
        }
        if( pos==1)
        {
            return insertAtbegin(data);
        }
        Node newNode = new Node(data);

int currpos=1;
        Node temp = head;


        while(temp !=null)
        {
            if( currpos == pos)
            {
  break;
            }
            temp = temp.next;
            currpos++;

        }

        Node prevnode;
        prevnode = temp.prev;
        newNode.next = temp;
        temp.prev= newNode;


        newNode.prev = prevnode;
        prevnode.next= newNode;

        return head;
    }

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

    insertAtbegin(10);
     insertAtEnd(12);
     insertAtEnd(13);
     insertAtbegin(9);


      traverse();
        System.out.println(" after chnages");
      insertatPosition(11,3);
      traverse();


        System.out.println("after insert at specific value chnages ");
        insertafterValue(40,9);
        traverse();


       // System.out.println(" after revrerse");
        //reverse();
        System.out.println(" after delete from begining");
        deletefrombeg();
        traverse();

        System.out.println(" after deleeting from end");
        deletefroend();
        traverse();



    }
}
