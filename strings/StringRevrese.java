package Strings;

public class StringRevrese {




    public static void main(String[] args) {



        // approach 1

        String s1 = "Bharath";

        for (int i = s1.length()-1; i>=0 ; i--)
        {
            System.out.print(s1.charAt(i));
        }


        // approach 2
        String s2 = "gowda";
        StringBuilder sb = new StringBuilder(s2);
        sb.reverse();
        System.out.println(sb);


        // approach 3

// here we use builder bcs string literal are immutable
        StringBuilder sn = new StringBuilder("bharath");

        int left = 0;
        int right = sn.length()-1;


        while(left<right) {
            char leftchar = sn.charAt(left);
            char rightchar = sn.charAt(right);


            sn.setCharAt(left,rightchar);
            sn.setCharAt(right,leftchar);



            left++;
            right--;


        }

        System.out.println(sn);



    }
}
