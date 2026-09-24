package DSA.ALLROTATES;

class RearrangeSign {
    public int[] rearrangeArray(int[] nums) {


        int [] positive = new int [nums.length];
        int [] negative = new int [nums.length];

        int [] result = new int [nums.length];

        int k =0 ;
        int j =0 ;

        for( int i =0 ; i<nums.length ; i++)
        {


            if( nums[i]>0)
            {
                positive[k] = nums[i];
                k++;
            }

            else
            {
                negative[j] = nums[i];
                j++;
            }
        }
        k=0;
        j=0;

        int x =0 ;
        for(int i =0 ; i<nums.length ; i++)
        {

            if( i %2 ==0)

            { result[x] = positive[k];
                x++;
                k++;
            }

            else
            {

                result [x] = negative[j];
                x++;
                j++;
            }


        }


        return result;


    }
}