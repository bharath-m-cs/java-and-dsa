package DSA.LinkedList;

public class ReverseLL {

    static  Node head = null;
    static  void reverse ()
    {
       Node temp = head;
Node nextNode = temp.next;
Node prevNode = null;

        while (temp  != null) {
             prevNode = temp;
             nextNode = temp.next;

            temp.next = prevNode;

            prevNode = temp;

            temp = nextNode;
        }

       head = prevNode;
    }

    public static void main(String[] args) {


        }
    }

