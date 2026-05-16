package Strings;

public class ReverseLetter {
    public static void main(String[] args) {
        class Solution {
            public String reverseOnlyLetters(String s) {
                StringBuilder sb = new StringBuilder(s);


                int l = 0;
                int r = sb.length()-1;
                while(l<r)
                {

                    char left = sb.charAt(l);
                    char right = sb.charAt(r);

                    if(!Character.isLetter(left))
                    {
                        l++;

                    }
                    else if( !Character.isLetter(right))
                    {
                        r--;
                    }
                    else

                    {
                        sb.setCharAt(l,right);
                        sb.setCharAt(r,left);
                        l++;
                        r--;
                    }


                }

                return sb.toString();


            }
        }
    }
}
