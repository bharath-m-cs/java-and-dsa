package Strings;

public class RemoveWhiteSpace {


    public static void main(String[] args) {
        String s1 = "bha ra th";

        System.out.println( s1.replace(" ",""));




        // suppose we have \n \t and all
        String s2 = " bhara \n rath   kumar";
        System.out.println(s2.replaceAll("\\s+ ",""));



        // oroginal approach;
        StringBuilder sb = new StringBuilder("welcome to the \n world of \t of programming ");
StringBuilder sv = new StringBuilder();
        int i = 0;
        while(i<sb.length())
        {
            char ch = sb.charAt(i);
            if (ch != ' ' && ch!=  '\t'  && ch != '\n')
            {
                sv.append(sb.charAt(i));
            }
            i++;
        }

        System.out.println(sv);
    }
}
