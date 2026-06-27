package DSA.LinkedList;

public class Removenodevaria {


    public static  Node removeNthFromEnd(Node head, int n) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }


        if (count == n) {
            head = head.next;
            return head;
        }

        temp = head;
        int currpos = 1;
        while (currpos < count - n) {
            temp = temp.next;
            currpos++;
        }
        temp.next = temp.next.next;

        return head;

    }
    public static void main(String[] args) {

    }
}
