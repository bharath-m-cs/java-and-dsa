package DSA.LinkedList;

class RemoveNodeGR{
    public Node removeNodes(Node head) {


        Node temp = head;
        Node prev = null;

        while (temp != null) {
            Node nextNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextNode;
        }

        Node curr = prev;
        Node prefix = null;
        Node newHead = null;
        int max = Integer.MIN_VALUE;

        while (curr != null) {

            if (curr.data >= max) {
                max = curr.data;

                if (newHead == null)
                    newHead = curr;

                prefix = curr;
                curr = curr.next;
            }
            else {
                prefix.next = curr.next;
                curr = curr.next;
            }
        }


        Node temp2 = newHead;
        Node prefix2 = null;

        while (temp2 != null) {
            Node nextNode = temp2.next;
            temp2.next = prefix2;
            prefix2 = temp2;
            temp2 = nextNode;
        }

        return prefix2;
    }
}