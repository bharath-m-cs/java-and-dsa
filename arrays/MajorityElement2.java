package DSA.Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class MajorityElement2{
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();

        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length ;
        int count = n/3;

        for( int i =0 ; i<nums.length ; i++)
        {
            map.put( nums[i], map.getOrDefault(nums[i],0)+1);


        }

        for(int x : map.keySet() )
        {
            if( map.get(x)>count)
            {
                list.add(x);
            }
        }

        return list ;
    }
}