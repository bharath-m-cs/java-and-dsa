package DSA.LinkedList;

class RemoveDupliacteII{
    public Node deleteDuplicates(Node head) {

        Node dummy = new Node(-1);
        dummy.next = head ;

        Node prev = dummy;
        Node curr = head ;



        while( curr!=null)
        {


            if( curr.next!=null && curr.data == curr.next.data)
            {
                while( curr.next!=null &&curr.data == curr.next.data)
                {
                    curr= curr.next;
                }

                prev.next = curr.next;
                curr= curr.next;
            }

            else
            {
                prev = prev.next;
                curr=curr.next;
            }




        }
        return dummy.next;
    }
}
