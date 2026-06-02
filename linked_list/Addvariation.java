package DSA.LinkedList;

import java.util.Stack;

public class Addvariation {


        Node addTwoNumbers(Node l1, Node l2) {

            Stack<Integer> s1 = new Stack<>();
            Stack<Integer> s2 = new Stack<>();

            while (l1 != null) {
                s1.push(l1.data);
                l1 = l1.next;
            }

            while (l2 != null) {
                s2.push(l2.data);
                l2 = l2.next;
            }

            int carry = 0;
            Node head = null;

            while (!s1.isEmpty() || !s2.isEmpty() || carry != 0) {

                int sum = carry;

                if (!s1.isEmpty()) {
                    sum += s1.pop();
                }

                if (!s2.isEmpty()) {
                    sum += s2.pop();
                }

                Node newNode = new Node(sum % 10);

                newNode.next = head;
                head = newNode;

                carry = sum / 10;
            }

            return head;
        }

    public static void main(String[] args) {

    }
}
