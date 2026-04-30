package DSA.Hashing;

import java.util.HashMap;

public class BasicCount {


    public static void main(String[] args) {
 int [] a = {4,5,4,6,5,4};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int x:a)
        {


            map.put(x,map.getOrDefault(x,0)+1);
        }

        System.out.println(map);
    }
}
