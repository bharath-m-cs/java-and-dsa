package DSA;

public class LowerBound {


    static int lowerBound(int [] arr , int x)

    {


        if ( x>arr[arr.length-1])
        {
            return -1;
        }
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






    public static void main(String[] args) {






        int [] arr = { 1,2,2,2,3,4,5};
        int result = lowerBound(arr,1);
     if ( result != -1)
     {
         System.out.println(" the lower bound is " + result);

     }
     else
     {
         System.out.println("  Given target is Out of range ");
     }
    }
}
