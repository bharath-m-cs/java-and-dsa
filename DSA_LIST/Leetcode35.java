package CodingExercise;

import java.util.Arrays;

public class Leetcode35 {

        static  int searchInsert(int[] nums, int target) {

            int low = 0;
            int high = nums.length-1;
            while( low<=high)
            {
                int mid = low + ( high-low)/2;

                if (nums[mid ]>=target)
                    high = mid-1;
                else
                {
                    low = mid +1;
                }
            }
            return low;



        }

    public static void main(String[] args) {
        int [] arr = { 1,3,5,6};
        int [] res = new int[]{searchInsert(arr, 2)};
        System.out.println(Arrays.toString(res));
    }

    }

