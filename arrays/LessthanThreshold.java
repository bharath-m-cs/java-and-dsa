package DSA.SlidingWindow;

class LessthanThreshold {
    public int numOfSubarrays(int[] arr, int k, int threshold) {



        int count =0 ;
        int windowSum =0 ;
        for( int i =0 ; i<k ; i++)
        {
            windowSum = windowSum + arr[i];

        }


        int answer = windowSum ;


        int wAvg = answer  / k;

        if( wAvg >= threshold)
        {
            count++;
        }

        for( int r = k ; r < arr.length ; r++)
        {

            windowSum += arr[r];
            windowSum -= arr[r-k];


            wAvg = windowSum/k;
            if( wAvg >= threshold)
            {
                count ++;
            }

        }


        return count ;
    }
}