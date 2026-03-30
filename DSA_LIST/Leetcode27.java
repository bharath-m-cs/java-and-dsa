package CodingExercise;

import java.util.Arrays;

public class Leetcode27 {


    static  int remove(int [] arr , int val)
    {
        int k=0;
        for (int i =0 ; i< arr.length;i++)
        {
            if ( arr[i] != val)
            {

                arr[k]=arr[i];
                k++;
            }


        }
        return k;

    }




    public static void main(String[] args) {

        int [] arr = { 1,2,2,3,4};

       int res =  remove(arr,2);
        System.out.println(res);
        System.out.println(Arrays.toString(arr));

    }


}
