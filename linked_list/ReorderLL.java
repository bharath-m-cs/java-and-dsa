package DSA.LinkedList;

public class ReorderLL {


        public void reorderList(Node head) {
            if (head == null || head.next == null) {
                return;
            }

            Node slow = head;
            Node fast = head;

            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }


            Node second = slow.next;
            slow.next = null;

            Node prev = null;
            while (second != null) {
                Node next = second.next;
                second.next = prev;
                prev = second;
                second = next;
            }

            // 3. Merge two halves
            Node first = head;
            second = prev;

            while (second != null) {
                Node temp1 = first.next;
                Node temp2 = second.next;

                first.next = second;
                second.next = temp1;

                first = temp1;
                second = temp2;
            }
        }
    }

