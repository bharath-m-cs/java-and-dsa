package CodingExercise;

import java.util.Arrays;

public class TraditionalReverse {

    public static void main(String[] args) {
        int [] arr = { 1,2,3,4,5,7,8,9};

               int right = arr.length-1;
        for (int i = 0 ; i< arr.length/2;i++)
        {
            int temp = arr[right];
            arr[right]= arr[i];
            arr[i] = temp;

            right--;



        }

        System.out.println(Arrays.toString(arr));



    }



}
