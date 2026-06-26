package DSA.LinkedList;

import java.util.Stack;

public class ReverseLLUSingStack {

static  Node head = null;
    public static Node reverseList(Node head) {



        if( head == null)
        {
            return head;
        }


        Stack<Node> s = new Stack<>();


        Node temp = head ;

        while( temp !=null)
        {
            s.push(temp);
            temp = temp.next;
        }

        head = s.pop();
        Node curr = head ;
        while( !s.isEmpty())
        {
            curr.next = s.pop();
            curr= curr.next;


        }
        curr.next = null;


        return head;
    }


}