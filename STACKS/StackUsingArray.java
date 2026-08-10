package DSA.Stacks;

public class StackUsingArray {

    protected int [] stackArray;
    protected  int top;



    public  StackUsingArray(int size)
    {
        stackArray= new int[size];
        top=-1;
    }


    public void push(int element)
    {
        if( isFull())
        {
            System.out.println(" cant insert , stack is full");
            return;


        }
        top++;
        stackArray[top]=element;

    }

    public boolean isFull()
    {
        if( top==stackArray.length-1)
        {
            return true;
        }
        return false;
    }


    public int pop()
    {
        if( isEmpty())
        {
            System.out.println(" cant pop because stack is empty");
            return -1;
        }
        int x = stackArray[top];
        top--;
        return x ;
    }

    public boolean isEmpty()
    {

        if(top==-1)
        {
            return true;
        }
        return false;
    }

    public int peek()
    {
        if(isEmpty())
        {
            System.out.println(" cant dispaly any element since stack is empty");
            return -1;
        }

int x = stackArray[top];
        return x ;
    }

    public void display()

    {

        for (int i=top ; i>=0;i--)
        {
            System.out.println(stackArray[i]);



        }
    }

    public static void main(String[] args) {


        StackUsingArray stack = new StackUsingArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println(stack.peek());



    }
}


