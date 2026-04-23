package DSA.Kadande;

public class maximumProductSubarray {


// brute force
    static  int product(int [] a)
    {

        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0 ; i<a.length;i++)
        {
            for (int j=i; j<a.length;j++)
            {
                int product = 1;
                for (int k = i; k<=j;k++){
                    product = product* a[k];


                }
                if (product>maxProduct)
                {
                    maxProduct = product ;
                }

            }



        }


        return maxProduct;
    }



static  int maxProduct(int [] a)
{
    int n = a.length;

    int prefix = 1;
    int suffix = 1;

int maxP = Integer.MIN_VALUE;
    for (int i = 0 ; i<n ; i++)
    {


        if (prefix == 0 )
        {
            prefix = 1;
        }
        if ( suffix ==0)
        {
            suffix =1;
        }
        prefix = prefix * a[i];
        suffix = suffix*a[n-i-1];

        maxP = Math.max(maxP, Math.max(suffix,prefix));

    }
return maxP;
}
    public static void main(String[] args) {
        int [] a = { 2,3,-2,4};
        int res = product(a);
        System.out.println(res);
    }
}
