package DSA.ALLROTATES;

public class RotationTypes {


  // right rotate by 1 time
        public void rotate1(int[] arr) {

            int rightMost = arr[arr.length-1];


            for( int i = arr.length-1 ; i>0 ; i--)
            {
                arr[i] = arr[i-1];
            }


            arr[0] = rightMost;


        }



// left rotate by 1 time
    public void rotate2(int[] arr) {

        int leftMost = arr[0];


        for( int i =0 ; i<arr.length-1 ; i--)
        {
            arr[i] = arr[i+1];
        }


        arr[arr.length-1] = leftMost;


        arr[0] = leftMost;


    }



    // left rotate by k times




        static   void reverse1( int arr[] , int l, int r )
        {
            while( l<r)
            {

                int temp= arr[l];
                arr[l] = arr[r];
                arr[r] = temp;

                l++;
                r--;
            }
        }

        public void rotateArr1(int arr[], int d) {

            d= d % arr.length;

            reverse1( arr, 0, d-1);
            reverse1(arr,d,arr.length-1);
            reverse1( arr, 0, arr.length -1);




        }



// right rotate by k times

        static void reverse2( int [] arr , int l , int r  )
        {

            while( l<r)
            {

                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp ;
                l++;
                r--;

            }


        }



        public void rotateclockwise(int[] arr, int k) {

            k = k%arr.length ;
            reverse2( arr , 0 , arr.length-1);
            reverse2(arr, 0 , k-1);
            reverse2( arr , k , arr.length-1);
        }





}
