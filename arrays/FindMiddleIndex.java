package DSA.Prefix;

class FindMiddleIndex {
    public int findMiddleIndex(int[] nums) {



        int lsum =0;
        int rsum =0;
        int tsum =0;

        for(int i =0 ;i<nums.length ; i++)
        {
            tsum = tsum +  nums[i];
        }

        for(int i =0;i<nums.length;i++)
        {

            rsum = tsum - nums[i] - lsum;
            if(lsum == rsum)
            {

                return i;
            }

            lsum =lsum +nums[i];
        }

        return -1;
    }
}
