package DSA.Kadande;

public class LongestSubarrayWithSumk {





    static  int longest (int [] a, int targetSum)
    {

int maxlen = 0;
        for (int i = 0 ; i<a.length;i++)
        {

            for (int j =i ; j<a.length;j++)
            {

                int sum = 0;

                for (int k = i ; k<=j;k++)
                {

                    sum = sum+a[k];


                }
                if (sum == targetSum)
                {
                    int len = j-i+1;
                    maxlen = Math.max(maxlen,len);
                }


            }
        }


return maxlen;



    }
    public static void main(String[] args) {

        int a [] = { 1,2,3,1,1,1,1,4,2,3};


int res = longest(a,3);
        System.out.println(res);

    }
}
