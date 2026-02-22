package CodingExercise;

import java.util.Scanner;

public class SumofMatrixElements {


        public static void main(String[] args) {



            Scanner sc = new Scanner(System.in);
            System.out.println(" Enter the No of rows ");
            int rows = sc.nextInt();
            System.out.println(" Enter the NO Of Columns ");
            int cols = sc.nextInt();
            int [] [] arr  =  new int[rows][cols];
int sum = 0;
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

                    sum = sum+arr[i][j];
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();

            }
            System.out.println(" The Sum of ELements Of Array " + sum );

        }











    }


