package DSA.LinkedList;

public class RemoveNodeWithoutHead {

    static  void remove ( Node L1)
    {
        L1.data = L1.next.data;
        L1.next = L1.next.next;
    }
}
