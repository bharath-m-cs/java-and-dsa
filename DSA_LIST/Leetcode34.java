package CodingExercise;

import java.util.Arrays;

public class Leetcode34 {

    static int firstpos(int [] nums, int target)
    {
        int low = 0;
        int high = nums.length-1;


        while(low<=high)
        {

            int mid = low+(high-low)/2;

            if( nums[mid]>=target)
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }

        }
        return low ;
    }



    static int lastpos(int [] nums, int target )
    {
        int low = 0;
        int high = nums.length-1;

        while(low <=high )
        {
            int mid = low+(high-low)/2;

            if( nums[mid]>target)
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }

        }
        return low-1;


    }

    static int[] searchRange( int [] nums , int target )
    {
        int n = nums.length;
        int lb = firstpos(nums, target );

        if( lb == n || nums[lb]!= target )
        {
            return  new int[] { -1, -1};
        }
        int up = lastpos(nums,target);

        return new int []{ lb,up};

    }


    public static void main(String[] args) {
        int [] nums = { 5,7,7,8,8,10};
       int res[]= searchRange(nums, 8);


        System.out.println(Arrays.toString(res));
    }


}
