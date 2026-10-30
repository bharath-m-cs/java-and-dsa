package DSA.Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class AllMissing {
    public List<Integer> findMissingElements(int[] nums) {

        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int start = nums[0];
        int end = nums[nums.length-1];

        HashSet<Integer> set = new HashSet<>();
        for( int i =0 ; i<nums.length ; i++)
        {

            set.add(nums[i]);
        }

        for( int i =start; i<=end ; i++)
        {
            if(!set.contains(i))
            {
                list.add(i);
            }

        }


        return list ;
    }
}