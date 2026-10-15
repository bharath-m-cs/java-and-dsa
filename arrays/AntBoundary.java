package DSA.Prefix;
class AntBoundary {
    public int returnToBoundaryCount(int[] nums) {

        int count =0;
        int sum = 0;
        for( int i =0 ; i<nums.length ; i++)
        {

            sum = sum + nums[i];

            if( sum ==0)
            {
                count++;
            }



        }

        if( sum <0  && count ==0 )
        {
            return 0;
        }

        return count;
    }
}