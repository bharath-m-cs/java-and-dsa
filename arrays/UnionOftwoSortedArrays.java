package DSA.TwoPointers;

import java.util.Arrays;

public class UnionOftwoSortedArrays {



    static  int [] union( int a[] , int b [])
    {


        int i =0 ;
        int j =0 ;
int k =0 ;
        int [] result = new int [a.length + b.length ];
        while( i<a.length  && j<b.length  )
        {
            if( a[i] <b[j])
            {
                result[k] = a[i];
                i++;
                k++;



            }


            else if( b[j]<a[i])
            {

                result[k] = b[j];
                j++;
                k++;
            }

            else {
                result[k] = a[i];
                i++;
                j++;
                k++;
            }


        }


        while ( i<a.length)
        {
            result[k] = a[i];
            i++;
            k++;
        }

        while( j<b.length )
        {
            result[k] = b[j];
            j++;
            k++;
        }

        return Arrays.copyOf(result,k);
    }




    public static void main(String[] args) {


        int [] a ={ 1,2,3,4,5};
        int [] b = { 1,2,3,6,7};


       int [] answer = union(a,b);
        System.out.println(Arrays.toString(answer));
    }
}
