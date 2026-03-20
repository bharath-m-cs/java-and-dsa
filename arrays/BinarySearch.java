package DSA;

public class BinarySearch {



    static  int binarySearch(int [] arr, int key)
    {
        int low = 0;
        int high = arr.length-1;
        while(low<=high )
        {
            if (arr[0]<arr[arr.length-1]) {
                int mid = low + (high-low ) / 2;



                if (key == arr[mid])
                    return mid;
                else if (key < arr[mid]) {
                    high = mid - 1;

                } else {
                    low = mid + 1;

                }
            }
            else
            {
                int mid = low + (high-low ) / 2;


                if (key == arr[mid])
                    return mid;
                else if (key < arr[mid]) {
                    low  = mid + 1;

                } else {
                    high  = mid - 1;

                }
            }
        }
        return -1;

    }



    public static void main(String[] args) {


        int [] arr1= { 2,5,7,10,15,17,22,25,50}; // ascending order
       int [] arr2 = { 50,25,22,10,5,4,3,1}; // descending order
int result1 = binarySearch(arr1,15);
int result2 = binarySearch(arr2,25);

if ( result1 != -1)
{
    System.out.println(" the element is found at " + result1);
} if (result2 != -1) {
    System.out.println( " the element is found at " + result2);

}
if ( result1 == -1 &&  result2 ==-1 )
{
    System.out.println(" the element is not found ");
}
    }
}
