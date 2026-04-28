package DSA.Greedy;

import java.util.Arrays;

public class Sellstocks1 {

static  int [] stcoks(int a[])
{

    int min = Integer.MAX_VALUE;
    int maxProfit=0;
    int profit = 0;
    int minIndex =0;
    int buyDay =0 ;
    int sellday = 0;
    for (int i = 0 ; i<a.length;i++)
    {


        if (a[i]<min)
        {
            min= a[i];
            minIndex=i;

        }
        profit = a[i]-min;
        if(profit>maxProfit)
        {
            maxProfit= profit;
            buyDay= minIndex;
            sellday=i;
        }

    }

    return new int []{buyDay,sellday};
}
    public static void main(String[] args) {

        int [] a = { 7,1,5,3,4,};
        int [] res = stcoks(a);
        System.out.println(Arrays.toString(res));
    }
}
