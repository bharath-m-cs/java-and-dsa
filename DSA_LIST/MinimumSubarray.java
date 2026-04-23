package DSA.Kadande;

public class MinimumSubarray {



    static  int minimum (int [] a)
    {
        int sum =0 ;
        int minSum = Integer.MAX_VALUE;

        for (int i =0 ; i< a.length;i++)
        {


            sum = sum+a[i];

            if (sum<minSum)
            {
                minSum= sum;
            }


            if (sum>0)
            {
                sum=0;
            }
        }


return minSum;

    }



    public static void main(String[] args) {
        int [] a = { 5,-3,5,};
        int res = minimum(a);
        System.out.println(res);

    }
}
