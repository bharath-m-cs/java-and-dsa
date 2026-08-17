package DSA.Stacks;

public class NextGreater1 {





        public int[] nextGreaterElement(int[] nums1, int[] nums2) {

            int[] res = new int[nums1.length];

            for (int i = 0; i < nums1.length; i++) {


                int pos = 0;

                while (nums2[pos] != nums1[i]) {
                    pos++;
                }


                res[i] = -1;

                for (int j = pos + 1; j < nums2.length; j++) {

                    if (nums2[j] > nums1[i]) {
                        res[i] = nums2[j];
                        break;
                    }
                }
            }

            return res;
        }
    }

