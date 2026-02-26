package JavaArrays;

import java.util.Arrays;

public class UtilArrays {

    public static void main(String[] args) {

        int[] num = {1, 10, 2, 75, 3, 20, 11};
        System.out.println("Original: " + Arrays.toString(num));

        // Sort only part of the array (index 3 to 5)
        Arrays.sort(num, 3, 6);
        System.out.println("Partially Sorted (indices 3–5): " + Arrays.toString(num));

        // New arrays for comparison
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};

        // Compare arrays
        System.out.println("Are arr1 and arr2 equal? " + Arrays.equals(arr1, arr2));
    }
}