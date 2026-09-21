package DSA.TwoPointers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// brute force
class ThreeSUM {
    public List<List<Integer>> findTriplets(int[] arr) {

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                for (int k = j + 1; k < arr.length; k++) {

                    if (arr[i] + arr[j] + arr[k] == 0) {

                        list.add(Arrays.asList(i, j, k));
                    }
                }
            }
        }

        return list;
    }
}




// optimal using two pointers

 /*class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {

                int sum = nums[i] + nums[l] + nums[r];

                if (sum == 0) {

                    list.add(Arrays.asList(
                            nums[i], nums[l], nums[r]
                    ));

                    l++;
                    r--;

                    while (l < r && nums[l] == nums[l - 1])
                        l++;

                    while (l < r && nums[r] == nums[r + 1])
                        r--;
                }

                else if (sum < 0) {
                    l++;
                }

                else {
                    r--;
                }
            }
        }

        return list;
    }
}
*/