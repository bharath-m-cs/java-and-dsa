package Strings;

public class Leetcode14 {




    static  String longestCommonPrefix(String[] strs) {

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < strs[0].length(); i++) {

                for (int j = 1; j < strs.length; j++) {

                    if (i >= strs[j].length() ||
                            strs[0].charAt(i) != strs[j].charAt(i)) {

                        return sb.toString();
                    }
                }

                sb.append(strs[0].charAt(i));
            }

            return sb.toString();
        }


    public static void main(String[] args) {
        String [] s = { "flower", "floor","float"};
        String res =longestCommonPrefix(s);
        System.out.println(res);

    }
    }

