package CodingExercise;

import java.util.Scanner;

public class MultiplytwoArray {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the No of Rows of matrix 1  ");
        int rows1 = sc.nextInt();
        System.out.println(" Enter the No of Columns  of matrix 1 ");
        int cols1 = sc.nextInt();

        int[][] arr1 = new int[rows1][cols1];

        System.out.println(" enter the elements of matrix 1 ");
        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }

        }


        System.out.println(" Enter the No of Rows of matrix 2 ");
        int rows2 = sc.nextInt();
        System.out.println(" Enter the No of Columns  of matrix 2 ");
        int cols2 = sc.nextInt();


        int[][] arr2 = new int[rows2][cols2];
        if (cols1!=rows2)
        {
            System.out.println(" Sorry cant multiply with these values");
            return;
        }


        System.out.println(" enter the elements of matrix 2 ");

        for (int i = 0; i < arr2.length; i++) {

            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }

        }

        int[][] arr3 = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {

            for (int j = 0; j < cols2; j++) {
                int sum = 0;
                for (int k = 0; k < cols1; k++) {
                    sum = sum + arr1[i][k]*arr2[k][j];
                    arr3[i][j] = sum;
                }

            }

        }


        System.out.println(" the elements of array 3 are ");

        for (int i =0; i<rows1 ;i++)
        {
            for (int j=0 ; j<cols2; j++)
            {
                System.out.print(arr3[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
