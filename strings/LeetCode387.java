package Strings;

import java.util.HashMap;

public class LeetCode387 {

static  int uniqueCharacter (String s)
{
    HashMap<Character,Integer> map = new HashMap<>();




    char [] ch = s.toCharArray();
    for (char  x : ch)
    {

        map.put(x, map.getOrDefault(x,0)+1);

    }
    for (int i =0 ; i<ch.length;i++)
    {
        if( map.get(ch[i])==1)
        {
           return i ;
        }

    }
    return -1;


}
    public static void main(String[] args) {


String s = "loveleetcode";
int res = uniqueCharacter(s);

if( res != -1) {

    System.out.println(" the first unique character is fount at index  " + res);
}
else
{
    System.out.println(" the result is not found ");
}


    }
}
