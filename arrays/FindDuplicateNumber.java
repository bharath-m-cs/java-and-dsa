package DSA.BasicArrays;

import java.util.HashMap;
import java.util.Map;

class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();


        for( int i =0 ; i<nums.length;i++)
        {
            map.put( nums[i] , map.getOrDefault(nums[i], 0) +1);


        }




        for( Map.Entry<Integer,Integer> s : map.entrySet())
        {

            if( s.getValue() >1)
            {

                return s.getKey();
            }

        }

        return -1;

    }
}
