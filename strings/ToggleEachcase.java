package Strings;

public class ToggleEachcase {


    public static void main(String[] args) {


        String s1 = "BHaRaTh ";
StringBuilder sb = new StringBuilder();
        for (int i =0 ; i< s1.length();i++)
        {

            char ch = s1.charAt(i);
            if (Character.isLowerCase(ch))
            {
                ch = Character.toUpperCase(ch);
                sb.append(ch);
            }
            else {
                ch = Character.toLowerCase(ch);
                sb.append(ch);
            }
        }

        System.out.println(sb);
    }
}
