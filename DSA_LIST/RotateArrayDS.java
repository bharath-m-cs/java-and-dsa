package CodingExercise;

import java.util.Arrays;

public class RotateArrayDS {


    static  int [] reverse(int []  arr , int l , int r)
    {

        int temp = 0;

        while(l<r)
        {
            temp= arr[l];
            arr[l]= arr[r];
            arr[r]= temp;

            l++;
            r--;


        }


        return arr ;
    }



static int []  RotateArray( int [] arr , int x)
{
    int n = arr.length-1;
    reverse(arr,0,n);
    reverse(arr,0,x-1);
    reverse(arr,x ,n);


    return arr;
}



    public static void main(String[] args) {
        int [] arr = { 1,2,3,4,5,6,7};
int [] res = RotateArray(arr,3);
        System.out.println(Arrays.toString(res));
    }
}
