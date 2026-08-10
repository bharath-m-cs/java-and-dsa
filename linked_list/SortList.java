package DSA.LinkedList;

import java.util.Arrays;

public class SortList {
    static Node head = null;

    public static Node sort(Node head) {
        Node temp = head;
        int n = 0;
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        int a[] = new int[n];
        int i = 0;
        temp = head;

        while (temp != null) {
            a[i] = temp.data;
            i++;
            temp = temp.next;

        }

        Arrays.sort(a);

        temp = head;
        i = 0;
        while (temp != null) {
            temp.data = a[i];
            i++;
            temp = temp.next;
        }

        return head;
    }
}
