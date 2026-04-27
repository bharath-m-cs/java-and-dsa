package DSA.Greedy;

import java.util.Arrays;

public class SellAndBuyI {


    static int buy (int []a)
    {
        int n = a.length;
        int min = Integer.MAX_VALUE;

          int minIndex =0;
        for (int i = 0;i<n;i++)
        {
            if (a[i]<min)
            {
                min= a[i];
                minIndex= i;
            }

        }

        return minIndex;
    }

    static int  sell(int []a)
    { int n = a.length;
        int Targetinex = buy(a);
        int maxi = Integer.MIN_VALUE;
        int   maxIndex = 0;
        for (int i = Targetinex+1; i<n ; i++)
        {if (a[i]>maxi)
        {
            maxi =a[i];
            maxIndex = i;
        }


        }
return maxIndex;
    }


    static  int [] buySell(int a[])
    {

        int buyDay = buy(a);
        int sellDay = sell(a);

        return new int[] { a[buyDay],a[sellDay]};
    }

    public static void main(String[] args) {
    int [] a = { 7,1,5,3,6,4};
    int [] maxProfitDay = buySell(a);
        System.out.println(Arrays.toString(maxProfitDay));


    }
}
