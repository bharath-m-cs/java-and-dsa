package DSA.Prefix;

class LeftRightSUmDifference {
    public int[] leftRightDifference(int[] nums) {

        int l =0 ;
        int r = 0;
        int t = 0;
        int [] answer = new int [nums.length];





        for( int i =0 ; i<nums.length ; i++)
        {

            t = t+ nums[i];

        }
        for( int i =0 ; i<nums.length ; i++)
        {
            r = t - nums[i] - l;
            answer[i] = Math.abs(l-r);

            l = l+nums[i];

        }
        return answer;
    }
}
