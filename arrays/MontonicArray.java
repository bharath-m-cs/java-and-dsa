package DSA.BasicArrays;

class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        boolean dec = true ;
        boolean inc = true ;



        for( int i =1 ; i<nums.length ; i++)
        {


            if( nums[i] > nums[i-1])
            {
                dec = false;
            }
            if( nums[i] < nums[i-1])
            {
                inc = false;
            }
        }


        return inc || dec;

    }
}