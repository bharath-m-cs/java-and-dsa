package DSA.Prefix;

import java.util.*;

class ContinousSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int len = 0;

        for (int i = 0; i < nums.length; i++) {

            sum = sum + nums[i];

            int rem = 0;

            if (k == 0) {
                rem = sum;
            } else {
                rem = sum % k;
            }

            if (k != 0 && rem == 0) {

                len = i + 1;

                if (len >= 2) {
                    return true;
                }
            }

            if (map.containsKey(rem)) {
                len = i - map.get(rem);

                if (len >= 2) {
                    return true;
                }
            }
            if (!map.containsKey(rem)) {
                map.put(rem, i);
            }
        }

        return false;
    }

}