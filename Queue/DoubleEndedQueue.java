package DSA.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DoubleEndedQueue {


    public static void main(String[] args) {


        Deque<Integer> d1 = new ArrayDeque<>();


        d1.add(10);
        d1.addFirst(20);
        d1.addLast(30);
        d1.add(40);
        System.out.println(   d1.getFirst());
        System.out.println(d1.getLast());
        System.out.println(d1);

    }
}
