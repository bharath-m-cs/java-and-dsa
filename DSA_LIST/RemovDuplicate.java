package CodingExercise;

import java.util.Arrays;

public class RemovDuplicate {


    static  int  removeDupliacte(int [] a)
    {
        int i = 0;

        for (int j = 1 ; j<a.length;j++ )
        {

            if (a[j]!=a[i])
            {
                a[i+1]=a[j];
                i++;
            }



        }


        return i+1;


    }



    public static void main(String[] args) {


        int [] a = { 1,1,2,2,2,3,3};
        int res = removeDupliacte(a);
        System.out.println(res);
        System.out.println(Arrays.toString(a));
    }
}
