package Strings;

public class CountVowelsAndConsonants {


    public static void main(String[] args) {
        String s1 = "BHARATh123";
        String s2 = s1.toLowerCase();
int vowelCount = 0;
int constantCount = 0;
        for (int i = 0 ; i<s2.length()-1;i++)
        {

            char ch = s2.charAt(i);
            if ( ch == 'a'|| ch== 'e'|| ch=='i'||ch== 'o'||ch== 'u')
            {
                vowelCount++;
            } else if (ch>='a' && ch<='z') {
                constantCount++;
            }


        }


        System.out.println(vowelCount);
        System.out.println(constantCount);
    }
}
