package DSA.LinkedList;

import java.util.Stack;

public class PalindromeLL {

    static  boolean isPalindrome() {
        Stack<Integer> s = new Stack<>();

Node head = null;
        Node temp = head ;
        while( temp != null)
        {
            s.push(temp.data);
            temp= temp.next ;

        }


        temp = head ;

        while( temp!=null)
        {

            if( s.pop() != temp.data )
            {
                return false ;
            }
            temp = temp.next ;
        }
        return true ;
    }

    public static void main(String[] args) {

    }
}
