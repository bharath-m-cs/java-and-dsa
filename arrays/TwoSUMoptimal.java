package DSA.Hashing;

import java.util.HashMap;

class TwoSUMoptimal {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap <>();



        int c=0;
        for( int i =0 ; i<nums.length ; i++)
        {


            c = ( target -nums[i]);
            if(map.containsKey(c))
            {
                int x = map.get(c);
                return new int []{i , x};
            }
            map.put( nums[i] , i);

        }


        return new int [] { -1,-1};
    }
}