package DSA;

public class MaximumSubarray {

static  int subarray(int [] arr )
{

     int max =0;
    for (int i = 0 ; i< arr.length;i++)
    {

        for (int j =i;j< arr.length;j++)
        { int sum =0;
            for (int k =i ; k<=j;k++)
            {
                sum = sum + arr[k];
                if(sum>max)
                {
                    max = sum;
                }
            }
        }

    }

return max ;

}




    public static void main(String[] args) {


        int [] arr = { 1,2,3,4};
        int res = subarray(arr);
        System.out.println(res);
    }
}
