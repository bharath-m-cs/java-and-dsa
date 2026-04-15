package Strings;

public class StringPalindrome {

static  String palindrome(String s1)
{
    int l = 0;
    int r = s1.length()-1;

    while(l<r)
    {
        if (s1.charAt(l)!= s1.charAt(r))
        {

            return " not a palindrome";

        }

        l++;
        r--;



    }
    return  "palindrome";

}
    public static void main(String[] args) {


        String s1 = "madam";

String res = palindrome(s1);
        System.out.println(res);
    }
}
