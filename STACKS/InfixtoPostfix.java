package DSA.Stacks;

import java.util.Stack;

public class InfixtoPostfix {

static  int precendence(char op)
{
    switch(op)
    {
        case '^': return 3;
        case '/','*' : return 2;
        case '+','-' : return 1;
    }
    return -1;
}

static  boolean isRightAssociative (char op)
{
    return op=='^';
}
    static  String infixtoPostfix (String exp)
    {
        StringBuilder output = new StringBuilder();
        Stack<Character> s = new Stack<>();

        for (char ch: exp.toCharArray())
        {
            if( Character.isLetterOrDigit(ch))
            {
                output.append(ch);
            }
            else if (ch == '(')
            {
                s.push(ch);
            }
            else if (ch==')')
            {
                while(!s.isEmpty() && s.peek()!='(') {
                    output.append(s.pop());
                }
                s.pop();
            }

else
            {
                while(!s.isEmpty() && s.peek()!='(' && (precendence(ch)<precendence(s.peek())  && !isRightAssociative(ch)))
                {
                    output.append(s.pop());
                }

                s.push(ch);
            }
        }
        while(!s.isEmpty())
        {
            output.append(s.pop());
        }
        return output.toString();
    }

    public static void main(String[] args) {


        String expression1 = "a+b*c";
        String expression2= "a+b*(c^d-e)^(f+g*h)-i";


        String postfix1 =infixtoPostfix(expression1);
        String postfix2= infixtoPostfix(expression2);


        System.out.println(postfix1);
        System.out.println(postfix2);
    }
}
