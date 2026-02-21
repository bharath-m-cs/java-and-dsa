package CodingExercise;

import java.util.Scanner;

public class ArrayInputUsingForEach {

    public static void main(String[] args) { //using traditional for loop
              Scanner sc = new Scanner(System.in);          // using for each loop
        System.out.println(" Enter  the No Of Elements ");
        int n = sc.nextInt();

        int [] arr = new int[n];
int sum = 0;
        System.out.println(" Enter the Elements of arrays ");

    for (int i = 0 ; i<arr.length; i++)
    {
        arr[i] = sc.nextInt();
    }

        System.out.println(" The Elements Of Array are ");

        for (int y : arr)
        {
            System.out.println(y);
        }



        for (int x : arr)
        {
            sum = sum +x;

        }
        System.out.println(" The Sum Of All elements  of array are " + sum );
    }



}
