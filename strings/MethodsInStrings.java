package Strings;

public class MethodsInStrings {


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
        String s1= "bharath";
        s1 = "xj";
        System.out.println(s1==s1);
        System.out.println(s1.equals(s1 ));


    }




}
