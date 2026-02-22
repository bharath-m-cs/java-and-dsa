package CodingExercise;

import java.util.Scanner;

public class MaxElementInArray {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the No of rows ");
        int rows = sc.nextInt();
        System.out.println(" Enter the NO Of Columns ");
        int cols = sc.nextInt();
        int [] [] arr  =  new int[rows][cols];

        System.out.println(" Enter the Elements of array");
        for (int i =0 ; i< arr.length;i++)
        {
            for (int j = 0 ; j<arr[i].length;j++)
            {
                arr[i][j]= sc.nextInt();
            }



        }

        System.out.println(" The Elements of array are ");
        for (int i =0 ; i< arr.length;i++)
        {
            for (int j = 0 ; j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();


        }


        int max = 0 ;
        for (int i =0 ; i< arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {

                    max = arr[i][j];
                }

            }
        }
        System.out.println(" the max element in the matrix  is " + max);

    }




}