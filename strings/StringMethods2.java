package Strings;

public class StringMethods2 {
    public static void main(String[] args) {


        String s1= "bharath";
        System.out.println(s1.substring(3)); // starting index is given , end index default till end of string
        System.out.println(s1.substring(2,6)); // start and end index mentioned manually


        String s2= "bharath Gowda";
        System.out.println(s2.substring(s2.indexOf(' ')));

        String file = "file.pdf";
        System.out.println(file.substring(file.indexOf(".")+1));

        String email = "info@jennylecturs";
        System.out.println(email.substring(email.indexOf("@")+1));




// 2 . to convert uppercase and lowercase
        String Name = "BHARATH";
        System.out.println(Name.toLowerCase());

        String xyz = "bharath";
        System.out.println(xyz.toUpperCase());


        // 3. remove leading and trailing spaces
        String str1 = "   bharath Gowda   ";
        System.out.println(str1.trim()); // space between strring are not trimmed/

// 4. given a string like sentence
        String sentence = "HEllo welcome to world of Coding"; // now we want to split these indiviaully
        String [] words = sentence.split(" "); // based on what we should seperate we shpuld mention
String [] limwords = sentence.split(" ",3 ); // here we can mention how many words



        for (int i =0 ; i<words.length;i++)
        {
            System.out.println(words[i]);
        }

        for (int i =0 ; i<limwords.length;i++)
        {
            System.out.println(limwords[i]);
        }

    }
}
