package DSA.Stacks;


import java.util.Stack;

class SubStrings {
    public String reverseParentheses(String s) {

        Stack<String> stack = new Stack<>();

        stack.push("");

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);


            if (ch == '(') {
                stack.push("");
            }


            else if (ch == ')') {


                String str = stack.pop();

                String reversed = new StringBuilder(str).reverse().toString();


                String previous = stack.pop();
                stack.push(previous + reversed);
            }

            else {


                String current = stack.pop();

                current = current + ch;


                stack.push(current);
            }
        }

        return stack.peek();
    }
}