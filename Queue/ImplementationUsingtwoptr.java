package DSA.Queue;

public class ImplementationUsingtwoptr {



    static int [] queue;
  static   int front ;
          static int rear =-1;



     public  ImplementationUsingtwoptr(int size)
    {

        this.queue=new int [size];
        front = -1;
        rear= -1;

    }
    static void enqueue(int x)
{

    if( rear== queue.length-1)
    {
        System.out.println(" cant insert queue is full");
        return ;
    }

    rear++;
    queue[rear]=x;
    if( front ==-1)
    {
        front++;
    }



}


public static  int dequeue()
{

    if( rear==-1  || front>rear)
    {
        System.out.println(" queue is empty , cant delete");
        return -1;
    }


    if( rear == front)
    {
        int removedElement = queue[front];
        front=-1;
        rear=-1;

        return removedElement;
    }


    int removeElement = queue[front];
    front++;

    return removeElement;

}





public static void display()
{
if( rear==-1 || front>rear)
{
    System.out.println("empty queue");
    return;
}

    for (int i=front ;i<=rear;i++)
    {
        System.out.print(queue[i]+ " ");
    }
}



    public static void main(String[] args) {
ImplementationUsingtwoptr s = new ImplementationUsingtwoptr(5);

enqueue(10);
enqueue(20);
enqueue(30);
display();


        System.out.println( " deleeted element is "+dequeue());


        dequeue();
        dequeue();

        display();

    }
}
