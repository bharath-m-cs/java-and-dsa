package DSA.Prefix;

class SumofoddLength {
    public int sumOddLengthSubarrays(int[] arr) {
        int len =0 ;
        int sum =0;
        int oddsum =0;
        for( int i =0 ; i<arr.length ; i++)
        {sum =0 ;

            for( int j =i ; j<arr.length ; j++)
            {

                sum = sum + arr[j];
                len = Math.abs(i-j)+1;
                if( len % 2!=0)
                {
                    oddsum = oddsum + sum;
                }
            }
        }


        return oddsum;
    }
}