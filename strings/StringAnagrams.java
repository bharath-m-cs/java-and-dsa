package Strings;

import java.util.Arrays;

public class StringAnagrams {


    public static void main(String[] args) {

        String s1 = " Silent";
        String s2 = "Listen";


        if (s1.length()!=s2.length())
        {
            System.out.println(" not a anagram ");
        }
        else {


            char[] str1 = s1.toLowerCase().toCharArray();
            char[] str2 = s2.toLowerCase().toCharArray();


            Arrays.sort(str1);
            Arrays.sort(str2);


            if (Arrays.equals(str1, str2)) {
                System.out.println(" anagream");
            } else {
                System.out.println(" not a anagaram");
            }
        }
    }
}
