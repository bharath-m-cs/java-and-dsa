package DSA.Stacks;

public class StackimplementUSingLL {

    static  Node top = null;
//public StackimplementUSingLL()
//{
//    this.top=null;
//}

public static void push( int value)
{

    Node newNode = new Node(value);
    newNode.next=top;
    top=newNode;
}



public static int pop()
{
    if( top==null)
    {
        System.out.println(" stack is empty");
        return -1;
    }

    int x = top.data;
    top = top.next;
    return x ;
}


public static  int peek()
{
    if( top==null)
    {
        System.out.println(" stack is empty ");
     return -1;
    }
    int x = top.data;
    return x ;

}


 static void display()
{
Node temp = top;
    while(temp!=null)
    {
        System.out.println(temp.data+" ");
        temp=temp.next;
    }
}


    public static void main(String[] args) {
push(10);
push(20);
push(30);

display();


int x =pop();
        System.out.println(" the poped element is "+x);
int s = peek();
        System.out.println(" the top most element is "+s);




    }
}
