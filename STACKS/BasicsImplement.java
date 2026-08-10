package DSA.Stacks;

import java.util.Stack;

public class BasicsImplement {


    public static void main(String[] args) {


        Stack<Integer> s = new Stack<>();


        // push operation
        s.push(10);
        s.push(20);
        s.push(30);


        //print the stack items as list
        System.out.println(s);


        // pop operation
        int a = s.pop();
        System.out.println(" the poped element is " + a);

        int b = s.pop();
        System.out.println("the poped element is "+ b);

        // peek element( which is at top ) but still stays in stack

        int c = s.peek();
        System.out.println(" the top element is "+c);


        // after all operations remaining element in stack

        System.out.println(" remaining elements in stack are "+ s);

    }
}
