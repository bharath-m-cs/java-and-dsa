package DSA.CircularLL;

public class CLLOperations {

static Node head = null;
static Node tail=null;



static  Node insertatbegin(int data)
{
    Node newNode = new Node(data);


    if( head == null)
    {
        head=newNode;
        tail=newNode;
        head.next =head ; /// reason its circular so extra pointer


    return head ;
    }

    newNode.next = head ;
    head = newNode;
    tail.next=newNode;

    return head;

}

static Node insertafterValue(int data, int val)
{

    Node newNode = new Node (data);
    if( head == null)
    {
        System.out.println(" cant insert list is empty ");
        return head ;
    }

    if( head.data ==val)
    {
        newNode .next =head.next;
        head.next=newNode;

        return head ;


    }
    Node temp = head ;
    do {
        if(temp.data==val)
        {break;

        }
        temp = temp.next;

    }
    while(temp!=head );
    if(temp==head)
    {
        System.out.println("no such value exist");
        return head;
    }
    newNode.next=temp.next;
    temp.next=newNode;
    return head;


}

static  Node insertbeforeposition(int data, int pos)
{
    Node newNode = new Node(data);
    if(pos<=0)
    {
        System.out.println(" not a valid positon");
        return  head;
    }
    if( pos==1)
    {
        return insertatbegin(data);
    }
    Node temp;
    Node prev;
    prev=null;
    temp=head;
    int currpos=1;
    do {
        if(currpos==pos)
        {
            break;
        }
        prev=temp;
 temp=temp.next;

    }
    while(temp!=head);
    if( temp==head )
    {
        System.out.println(" not a valid position so cant do operation");
        return head;

    }
    newNode.next=prev.next;
    prev.next=newNode;
    return head ;
}
static  Node insertAtend(int data)
{
    Node newNode = new Node(data);

    if( head ==null)
    {
       head = newNode;
       tail=newNode;
       head.next=head;
       return head ;
    }
    tail.next = newNode;
    newNode.next = head ;
    tail=newNode;
    return head ;

}

static void traverse()
{
    if( head ==null)
    {
        System.out.println(" list is empty ");

    }
    Node temp = head ;
    do {
        System.out.print(temp.data+" ");
        temp = temp.next;
    }
    while( temp!=head);


}

    public static void main(String[] args) {
        insertatbegin(20);
        insertatbegin((10));
        traverse();
    }

}
