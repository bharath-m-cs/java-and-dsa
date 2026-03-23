package CodingExercise;

public class CountOccurUsingbinary {

    static int lowerBound(int [] arr , int x)

    {



        int low = 0;
        int high = arr.length-1;
        while( low<=high)
        {
            int mid = low + ( high-low)/2;

            if (arr[mid ]>=x)
                high = mid-1;
            else
            {
                low = mid +1;
            }
        }
        return low;
    }


    static int   upperBound(int [] arr , int x)

    {



        int low = 0;
        int high = arr.length-1;
        while( low<=high)
        {
            int mid = low + ( high-low)/2;

            if (arr[mid ]>x)
                high = mid-1;
            else
            {
                low = mid +1;
            }
        }
        return low;
    }

    static  int count( int [] arr , int x)
    {

        int count =0 ;
        count = upperBound(arr, x)-lowerBound(arr, x);
        return count;

    }





    public static void main(String[] args) {


        int [] arr = { 1,1,1,2,2,3,3,};
        int res=count(arr,1);
        System.out.println(" the count is " + res);
    }
}
