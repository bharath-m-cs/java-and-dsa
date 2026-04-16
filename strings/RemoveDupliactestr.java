package Strings;

public class RemoveDupliactestr {


    public static void main(String[] args) {

        String str = " sandeeep";
        StringBuilder sb = new StringBuilder();

        for (int i = 0 ; i<str.length();i++)
        {
            char ch = str.charAt(i);
            if ( sb.indexOf(String.valueOf(ch))== -1)
            {
                sb.append(str.charAt(i));
            }


        }
        System.out.println(sb);
    }
}
