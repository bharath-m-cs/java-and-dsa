package DSA.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Basics {


    public static void main(String[] args) {

        Queue<Integer> s = new LinkedList<>() ;

// insertion
        s.add(10);
        s.add(20);
        s.add(30);
        System.out.println(" the queue elements are "+s);


        // deletion

        s.remove();
        System.out.println(" after deletion elements are "+s);


        // find whose at first or top
        System.out.println( " the peek element is "+s.peek());


        // applications of s.element  anbd s.poll
s.remove();

        System.out.println( s.element());  // when queue is empty if we use s.peek() it gives u null

        // whereas if u use s.element it gives u exception error

s.remove();
        System.out.println(s.poll());





        // detailed about peek , element , poll

       /* peek() → see front, don't remove, returns null if empty
        element() → see front, don't remove, throws exception if empty
        poll() → remove front, returns null if empty
    */


    }


}
