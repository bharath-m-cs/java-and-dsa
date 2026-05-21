package DSA.LinkedList;

public class DeleteFromLl {



    static void deleteAtEnd( )
    {
        Node temp = head ;
        while( temp.next.next !=null)
        {

            temp = temp.next;

        }
        temp.next = null;


    }


    static  void deleteFromPos(int pos) {

        Node temp = head;
        int currPos = 1;


        if (pos==1) {
            deleteAtbeginning();
        } else {
            while (currPos < pos - 1) {
                temp = temp.next;
                currPos++;
            }


        }

    }



    public static void main(String[] args) {

    }
}
