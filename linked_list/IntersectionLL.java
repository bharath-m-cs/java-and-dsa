package DSA.LinkedList;

import java.util.HashSet;

public class IntersectionLL {

static  Node intersect( Node headA, Node headB)
{
    Node temp1 = headA;
    Node temp2 = headB;
    HashSet<Node> set = new HashSet<>();
        while( temp1 != null)
    {
        set.add( temp1);
        temp1 = temp1.next ;
    }


        while( temp2 != null)
    {
        if( set.contains( temp2))
        {
            return temp2;
        }
        set.add( temp2);
        temp2 = temp2.next ;

    }
        return null;

}




public static void main(String[] args) {

    }
}
