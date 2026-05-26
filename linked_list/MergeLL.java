package DSA.LinkedList;

public class MergeLL {

    public Node mergeTwoLists(Node list1, Node list2) {


        Node temp1 = list1;
        Node temp2 = list2;


        Node dummy = new Node(-1);
        Node temp = dummy;

        while(temp1 != null && temp2 != null )
        {

            if( temp1.data <temp2.data)
            {
                temp.next = temp1;

                temp1= temp1.next ;
            }
            else
            {
                temp.next = temp2;

                temp2= temp2.next ;
            }

            temp = temp.next;
        }

        if( temp1 !=null)
        {
            temp.next = temp1;
            temp = temp.next ;
        }
        else
        {
            temp.next = temp2;
            temp = temp.next ;
        }

        return dummy.next;
    }

    public static void main(String[] args) {


    }
}
