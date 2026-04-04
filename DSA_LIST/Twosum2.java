package DSA;

import java.util.Arrays;

public class Twosum2 {


static  int [] twoSum( int [] arr , int target )

{

    int l = 0;
    int r = arr.length-1;

    while(l<r)
    {
        if (arr[l]+arr[r]== target )
            return  new int[]{l,r};


        else if (arr[l]+arr[r]<target )
        {
        l++;
        }

        else {

            r--;
        }
    }

return new int[]{-1,-1};

}



    public static void main(String[] args) {

    int [] arr = { 1,7,9,11,13};
    int [] res = twoSum(arr,24);
        System.out.println(Arrays.toString(res));
    }
}
