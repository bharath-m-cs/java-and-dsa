package DSA.Greedy;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersArray {


    static ArrayList<Integer> leader(int a[])
    {int n = a.length;
        ArrayList<Integer> res = new ArrayList<>();
        int maxFRomRight = a[n-1];
        res.add(a[n-1]);
        for (int i = n-2; i>=0;i--)
        {
            if (a[i]>maxFRomRight)
            {
                maxFRomRight= a[i];
                res.add(a[i]);
            }


        }

        Collections.reverse(res);
        return res;
    }


    public static void main(String[] args) {
        int [] a = { 26,17,4,18,5,2};
ArrayList<Integer> java = leader(a);
        System.out.println(java);
    }
}
