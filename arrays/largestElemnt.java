package DSA.BasicArrays;

class largestElemnt {
    public static int largest(int[] arr) {

        int maxi  = Integer.MIN_VALUE;


        for( int i =0 ; i<arr.length;i++)
        {


            maxi = Math.max( arr[i], maxi );
        }

        return maxi ;
    }
}

