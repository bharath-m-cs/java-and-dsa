package DSA;

import java.util.Arrays;

public class FlourCeilDS {


    static  int Flour ( int [] arr  , int x)
    {
        int low =0 ;
        int high = arr.length-1;

        while(low<=high )
        {
            int mid = low + (high-low)/2;

            if(arr[mid]<=x)
            {
                low = mid+1;
            }
            else
            {
                high = mid -1;
            }




        }
        return high;
    }


    static  int ceil(int [] arr , int x )
    {
        int low = 0 ;
        int high = arr.length-1;
        while(low<=high)
        {

            int mid = low + (high-low )/2;
            if( arr[mid] >x)
                high = mid -1;

            else
            {
                low = mid +1;
            }


        }
        return low ;

    }

    static  int [] FlourCeil(int [] arr , int x)
    {
        int f = Flour(arr,x);
        int c = ceil(arr,x);

        int [] res = { f,c};

        return  res;






    }



    public static void main(String[] args) {


        int [] arr = { 2,5,7,8,10,15,18,20,25};
       int [] ans =     FlourCeil(arr,17 );
        System.out.println(Arrays.toString(ans));
    }
}
