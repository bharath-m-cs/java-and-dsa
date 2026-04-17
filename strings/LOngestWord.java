package Strings;

public class LOngestWord {


    public static void main(String[] args) {


        String sentence = " Welcome to The World of Programming";
        String LongestWord = "";
        String [] words = sentence.split(" ");
        for (String num : words )
        {


            if (num.length()> LongestWord.length())
            {

                LongestWord = num;
            }

        }
        System.out.println(" the longest word is " + LongestWord);
    }
}
