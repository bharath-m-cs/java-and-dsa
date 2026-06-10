package CodingExercise;

import java.util.Scanner;

public class Subset {

static  int n , target ;
static  int [] arr;


    static  void find( int index , int sum , String subset)
    {
        if( sum == target)
        {
            System.out.println(subset);
            return;
        }

        if( sum > target || index ==n)
        {
            return ;
        }

        find( index+1 , sum + arr[index], subset+arr[index]+" ");


        find( index+1, sum , subset);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println(" enter the no of elements");
        n = sc.nextInt();


        arr = new int [n];

        System.out.println(" enter the elements ");
        for (int i =0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }


        System.out.println(" enter target sum");
        target = sc.nextInt();


        find(0,0,"");

    }
}
