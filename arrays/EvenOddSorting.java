package DSA.TwoPointers;

import java.util.Arrays;

class EvenOddSorting {
    public int[] sortArrayByParity(int[] nums) {


        Arrays.sort( nums);

        int l=0 ;
        int r = nums.length-1;


        for( int i =0 ; i<r ;)
        {


            if( nums[i] %2 ==0)
            {int temp = nums[l];
                nums[l] = nums[i];
                nums[i] = temp ;
                l++;
                i++;
            }
            else
            {
                int temp = nums[r];
                nums[r] = nums[i];
                nums[i] = temp;
                r--;
            }
        }

        return nums;

    }
}