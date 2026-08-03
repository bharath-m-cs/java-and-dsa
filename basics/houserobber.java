package Algorithms;

import java.util.Scanner;

public class houserobber {


        static int rob(int[] nums) {
            int prev1 = 0, prev2 = 0;

            for (int money : nums) {
                int curr = Math.max(prev1, prev2 + money);
                prev2 = prev1;
                prev1 = curr;
            }
            return prev1;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of houses: ");
            int n = sc.nextInt();

            int[] nums = new int[n];
            System.out.println("Enter money in each house:");
            for (int i = 0; i < n; i++)
                nums[i] = sc.nextInt();

            System.out.println("Maximum money robbed = " + rob(nums));

            sc.close();
        }
    }

