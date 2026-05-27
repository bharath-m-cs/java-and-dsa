package DSA.LinkedList;

public class RemoveNthNode {

    static Node remove(int n) {
    Node head = null;

    int count = 0;
    Node temp = head;
        while(temp!=null)

    {

        count++;
        temp = temp.next;
    }

    temp =head;
    Node delNode = null;

if(count-n ==0)

    {
        head = head.next;
    }
else

    {
        for (int i = 1; i < count - n; i++) {
            temp = temp.next;


        }
        delNode = temp.next;
        temp.next = temp.next.next;


    }

   return head;

}
    public static void main(String[] args) {

    }
}
