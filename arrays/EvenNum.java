package CodingExercise;

import java.util.Scanner;

public class EvenNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the no of elements U Want To Enter ");
        int n = sc.nextInt();

        int [] arr = new int [n] ;

        System.out.println(" Enter the Elements Of Array");
        for (int i =0 ; i<arr.length; i++)
        {
            arr[i]= sc.nextInt();


        }


        System.out.println(" The Numbers are : ");
        for (int x : arr)
        {
            System.out.println(x);
        }



        System.out.println(" The Even Numbers From The List Are ");
for (int x : arr)
{
    if ( x % 2 == 0 )
        System.out.println(x);
}

    }















}
