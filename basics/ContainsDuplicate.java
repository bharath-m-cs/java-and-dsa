package DSA.Hashing;

import java.util.HashMap;

public class ContainsDuplicate {


    static  boolean Dupliacte (int a[])
    {

        HashMap <Integer,Integer> map  = new HashMap<>();
        for (int i =0 ; i< a.length;i++)
        {
            map.put(a[i], map.getOrDefault(a[i],0)+1);

        }
for (int y : map.keySet())
{
    int value = map.get(y);



    if (value >1)
    {
        return true ;
    }
}
    return  false;

    }



    public static void main(String[] args) {
        int [] a = { 1,2,3,4};
        boolean res = Dupliacte(a);
        System.out.println(res);

    }
}
