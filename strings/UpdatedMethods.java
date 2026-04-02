package Strings;

public class UpdatedMethods {
    public static void main(String[] args) {
        // 1. length of String
        String name  = "bharath m";
        String rating = "super@123";
        System.out.println(name.length());  // also counts space
        System.out.println(rating.length()); // also include nums bcs inside " "



        // 2. check whether the string is empty
        String result = "false";
        System.out.println(result.isEmpty()); // output will be a boolean


        // 3, check whether it is blank

        String str = "  ";
        System.out.println(str.isBlank());

// 4. checking eqaulity between two string s


        // type 1 using string literals
        String s1 = "jenny";
        String s2 = "jenny";
        System.out.println(s1==s2);  // here since string literals , same adddress ref in pool
        System.out.println(s1.equals(s2));

// type 2 here using new keyword
        String str1 = new String("jenny");
        String str2 = new String("jenny");
        System.out.println(str1==str2);// here since new keyword , new memory , new address
        System.out.println(str1.equals(str2));


        // type 3 , same content with differnce in case
//(using ignore  case method )
        String n = "Jenny";// caps
        String m = "jenny";// small
        System.out.println(n.equalsIgnoreCase(m)); // true



        // 5.  comparesto ( comapre with ASQI VALUE )
        String str3= "Jenny";
        String str4 = "jenny";
        System.out.println(str3.compareTo(str4)); //str3-str4
        System.out.println(str4.compareTo(str3)); // str4-str3


        // 6. to find index of character
        String str5 = "bharath";
        System.out.println(str5.indexOf('e')) ;
        System.out.println(str5.indexOf('a',3)); //   if 2 same letters we can mention from which index
        System.out.println(str5.lastIndexOf('a')); //last index of a


        // 7 . accesing characters of string

        String sr = "bharath";
        for (int i =0 ; i<sr.length();i++)
        {
            System.out.println(sr.charAt(i));

        }
    }
}
