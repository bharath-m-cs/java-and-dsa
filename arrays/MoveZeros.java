package CodingExercise;

import java.util.Arrays;

public class MoveZeros {



    static void moveZero ( int[] arr)
    {
        int i =0;

        for (int j=0; j<arr.length;j++)
        {
            if (arr[j]!=0)
            {

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }


        }
        System.out.println(Arrays.toString(arr));



    }









    public static void main(String[] args) {


        int [] arr = { 0,1,0,3,4,5};
moveZero(arr);

    }
}
