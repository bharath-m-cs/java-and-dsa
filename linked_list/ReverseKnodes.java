package DSA.LinkedList;

public class ReverseKnodes {




        public Node reverseKGroup(Node head, int k) {

            if (head == null || k == 1)
                return head;

            Node dummy = new Node(0);
            dummy.next = head;

            Node prevGroupTail = dummy;
            Node temp = head;

            while (true) {


                Node checker = temp;
                int count = 0;

                while (checker != null && count < k) {
                    checker = checker.next;
                    count++;
                }

                if (count < k)
                    break;

                Node prev = null;
                Node tail = temp;

                for (int i = 0; i < k; i++) {
                    Node nextNode = temp.next;
                    temp.next = prev;
                    prev = temp;
                    temp = nextNode;
                }


                prevGroupTail.next = prev;


                tail.next = temp;


                prevGroupTail = tail;
            }

            return dummy.next;

    }
}
