package DSA.LinkedList;

public class InsertAtPos {
    static  Node head;
    static  Node tail;
    static  void insertAtpostion(int data, int position)
    {

        Node posNode = new Node(data);
        Node temp = head ;
        int curPos = 1;


        if(position ==1 )
        {
            posNode.next = head;
            head = posNode;
        }
        else {
            while (curPos < position - 1) {
                temp = temp.next;
                curPos++;
            }
            posNode.next = temp.next;
            temp.next = posNode;
        }

    }







}
