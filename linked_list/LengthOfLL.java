package DSA.LinkedList;

public class LengthOfLL {
static  Node head =null;
static  void insertAtend( int data )
{
    Node newNode = new Node(data);
    Node temp = head ;
    if(head ==null )
    {
        newNode.next = head ;
        head= newNode;
    }
    else
    {
        while( temp.next !=null)
        {
            temp= temp.next;
        }
        temp.next = newNode;


    }

}


    static void  traverse()
    {Node temp = head;
        int length = 0;
        if( head == null)
        {
            System.out.println("ll is empty ");
        }

        else
        {
            while(temp!= null)
            {
                System.out.print(temp.data+"->");
                temp= temp.next;

            }
            System.out.println("end");

        }

    }

static  int  traverseAndlength ()
{Node temp = head;
    int length = 0;
    if( head == null)
    {
        System.out.println("ll is empty ");
    }

    else
    {
        while(temp!=null)
        {  length++;
            temp = temp.next ;
            }

    }
return length;
}



//static  int length ()
//{
//   int res =  traverseAndlength();
//   return res;
//}
    public static void main(String[] args) {
        insertAtend(20);
  
        traverse();
        int res = traverseAndlength();
        System.out.println(res);

    }
}
