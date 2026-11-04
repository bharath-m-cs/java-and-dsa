package DSA.Greedy;

import java.util.Arrays;

class  MinMovees{
    public int minMoves(int[] nums) {

        Arrays.sort(nums);
        int count =0 ;
        int diff = 0;
        int target = nums[nums.length-1];
        for( int i =0 ; i<nums.length ; i++)
        {

            diff = Math.abs(nums[i] - target) ;
            count = count + diff;
        }

        return count ;
    }
}