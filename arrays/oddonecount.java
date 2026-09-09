package DSA.Hashing;

import java.util.HashMap;
import java.util.Map;

class oddonecount {

    int getOddOccurrence(int[] arr) {

        HashMap<Integer,Integer> s = new HashMap<>();
        int n = arr.length;
        for(int i =0 ; i<arr.length;i++)
        {
            if(s.containsKey(arr[i]))
            {
                s.put(arr[i],s.get(arr[i])+1);
            }
            else
            {

                s.put(arr[i],1);
            }

        }
        for(Map.Entry<Integer, Integer> entry : s.entrySet())
        { if(entry.getValue() % 2 != 0) { return entry.getKey(); } } return -1;
    }
}