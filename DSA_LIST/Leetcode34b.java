package CodingExercise;

import java.util.Arrays;

public class Leetcode34b {


        static  int[] searchRange(int[] nums, int target) {
            int [] res = { -1,-1};
            // brute force approach

            for(int i=0; i<nums.length;i++)
            {

                if(nums[i]==target )
                {

                    if(res[0] == -1)
                    {
                        res[0]=i;
                    }

                    res[1]=i;
                }
            }
            return res;
        }

    public static void main(String[] args) {
        int [] arr = { 1, 2, 3, 5, 7,8,8 ,9};
       int [] result =  searchRange(arr,8);
        System.out.println(Arrays.toString(result));
    }
}
