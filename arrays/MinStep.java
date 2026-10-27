package DSA.Prefix;

class MinStep{
    public int minStartValue(int[] nums) {

        int sum = 0;
        int min = 0;
        for( int i =0 ; i<nums.length ; i++)
        {
            sum = sum + nums[i];
            min= Math.min( sum, min);



        }

        return Math.abs(min)+1;
    }
}