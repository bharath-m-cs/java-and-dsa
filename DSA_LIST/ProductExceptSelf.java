package DSA.Prefix;

import java.util.Arrays;

public class ProductExceptSelf {

// brute force

    static  int [] productExp(int []a)
    {

        int n = a.length;
        int [] newArray = new int[n];
        int product ;
        for (int i = 0 ; i<a.length;i++)
        {
            product =1;
            for (int j = 0; j<n;j++)
            {
                if (i!=j) {
                    product = product * a[j];
                }
            }
            newArray[i] = product;
        }


        return newArray;
    }



    // optimal


    public static void main(String[] args) {
        int [] a = { 1,2,3,4};
        int [] res = productExp(a);
        System.out.println(Arrays.toString(res));
    }
}
