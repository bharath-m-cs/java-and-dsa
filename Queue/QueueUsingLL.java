package DSA.Queue;

public class QueueUsingLL {

 static  Node front ,rear  ;


public QueueUsingLL()
{
    front =null;
    rear =null;

}


static  boolean enqueue(int x)
{
Node newNode = new Node(x);

if( front == null)
{
    front = newNode ;
    rear = newNode;

    return true;


}
rear.next = newNode;
rear = newNode;


return true ;


}


static  int dequeue()
{
    if( front ==null)
    {
        System.out.println(" cant delete ");
        return -1;
    }

    Node temp = front;
    front = front.next;




    if(front ==null)
    {
        rear= null;
    }
    return temp.data;

}


static  void display()
{

    if( front == null)
    {
        System.out.println(" queue is empty ");
        return ;
    }
    Node temp = front;

    while( temp !=null)
    {

        System.out.print(temp.data+" ");
        temp = temp.next;
    }




}


    public static void main(String[] args) {
        QueueUsingLL q = new QueueUsingLL();
enqueue(2);
enqueue(3);
enqueue(4);
        System.out.println("the inserted elements are");
display();
        System.out.println();

dequeue();
dequeue();
dequeue();
        System.out.println("elements after deletion");
display();
        System.out.println(dequeue());
    }

}
