package DSA.Prefix;

class  SumofVariableLength {
    public int subarraySum(int[] nums) {


        int totalsum =0 ;
        for( int i =0 ; i<nums.length ; i++)
        {



            int  start = Math.max( 0 , i-nums[i]);
            int sum =0 ;
            for( int j = start ; j<=i ; j++)
            {
                sum = sum + nums[j];

            }
            totalsum += sum;
        }

        return totalsum;
    }
}