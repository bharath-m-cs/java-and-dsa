package DSA.Kadande;

class Circular {





    static int minSum(int [] nums)
    {
        int sum =0 ;
        int minSum = Integer.MAX_VALUE;

        for (int i =0 ; i< nums.length;i++)
        {


            sum = sum+nums[i];

            if (sum<minSum)
            {
                minSum= sum;
            }


            if (sum>0)
            {
                sum=0;
            }
        }


        return minSum;
    }


    static int maxSum(int [] nums)
    {
        int sum =0;
        int maxSum =Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++)
        {
            sum= sum+nums[i];

            if(sum>maxSum)
            {
                maxSum = sum;
            }
            if(sum<0)
            {
                sum =0;
            }

        }

        return maxSum;
    }


    static int totalSum(int []nums)
    {
        int sum =0;
        for(int i =0 ; i<nums.length;i++)
        {
            sum = sum+nums[i];

        }
        return sum;
    }
    public int maxSubarraySumCircular(int[] nums) {



        int total =  totalSum(nums);
        int minS = minSum(nums);
        int  maxS = maxSum(nums);

        int maxCircular = total - minS;

        if(maxS<0)
        {
            return maxS;
        }

        return Math.max(maxS, maxCircular);

    }

public static void main(String[] args) {

}
}