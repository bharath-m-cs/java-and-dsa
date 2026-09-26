package DSA.BasicArrays;

class ThirdLargest {
    public int thirdMax(int[] nums) {

        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            maxi = Math.max(nums[i], maxi);
        }


        int sec_max = Integer.MIN_VALUE;
        boolean found1 = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < maxi && (!found1 || nums[i] > sec_max)) {
                sec_max = nums[i];
                found1 = true;
            }
        }

        if (found1 == false) {
            return maxi;
        }


        int third_max = Integer.MIN_VALUE;
        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < sec_max && (!found || nums[i] > third_max)) {
                third_max = nums[i];
                found = true;
            }
        }

        if (found == false) {
            return maxi;
        }

        return third_max;
    }
}
