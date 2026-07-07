package DSA.LinkedList;

public class SortedlistLLdup {

        public Node deleteDuplicates(Node head) {

            Node dummy = new Node(0);
            dummy.next = head;

            Node prev = dummy;
            Node temp = head;

            while (temp != null) {

                if (temp.next != null && temp.data == temp.next.data) {

                    while (temp.next != null && temp.data == temp.next.data) {
                        temp = temp.next;
                    }


                    prev.next = temp.next;

                }
                else {

                    prev = temp;
                }

                temp = temp.next;
            }

            return dummy.next;
        }
    }

