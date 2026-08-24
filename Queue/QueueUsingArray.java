package DSA.Queue;

public class QueueUsingArray {

    static int [] queue;
    static int rear;
   static  int capacity;


    public QueueUsingArray(int size)
    {
        this.capacity=size;
        rear=-1;
       this.queue = new int [capacity];
        System.out.println(" queue has been created of size "+size);

    }

     static void enqueue(int x)
    {
        if(rear==queue.length-1)
        {
            System.out.println(" cant insert , queue is full");

        }
        else {

            rear++;
            queue[rear]=x;
        }


    }



    static  void display()
    {

        if( rear==-1)
        {
            System.out.println(" queue is empty ");
            return ;
        }
        for (int i=0 ; i<=rear;i++)
        {

            System.out.print(queue[i] + " ");
        }

    }

    public int dequeue()
    {

if( rear==-1)
{
    System.out.println(" queue is empty cant delete");
return -1;
}

else
{
    int removedElement = queue[0];
    for (int i =1; i<=rear;i++)
    {
        queue[i-1]=queue[i];
    }
    rear--;
    return removedElement;
}
    }



    public static void main(String[] args) {

        QueueUsingArray s = new QueueUsingArray(5);

enqueue(5);
enqueue(10);
enqueue(30);
display();
    }
}
