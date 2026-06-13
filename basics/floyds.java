package CodingExercise;

import java.util.Scanner;

public class floyds {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" enter the no of vertices");
        int n = sc.nextInt();

        int [][] a = new int [n][n];

        System.out.println(" enter the cost matrix");
        for (int i =0 ; i<n; i++)
        {
            for (int j =0 ; j<n ; j++)
            {
                a[i][j]= sc.nextInt();
            }
        }


        for (int k = 0 ; k<n;k++)
        {
            for (int i =0 ; i<n; i++)
            {
                for (int j = 0 ; j<n; j++)
                {
                    a[i][j] = Math.min(a[i][j], a[i][k]+a[k][j]);
                }
            }
        }

        System.out.println(" all shortest pairs ");
        for (int i =0 ; i<n;i++)
        {
            for (int j=0 ; j<n;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
