package DSA.BasicArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {



        HashSet<Integer> set = new HashSet<>();

        for( int i=0 ; i<a.length;i++)
        {

            set.add(a[i]);
        }
        for(int i =0 ; i<b.length ;i++)
        {
            set.add(b[i]);
        }


        ArrayList<Integer> list = new ArrayList<>();

        for( int x : set)
        {
            list.add(x);
        }

        Collections.sort(list);

        return list;
    }
}