package DSA;

import java.util.Scanner;

public class Timeandspace {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the value of n ");
        int n= sc.nextInt();



      // 1.  O(n^2)

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(i + " " + j);
            }
        }


        // 2. O(n)
        for (int i = 1; i < n; i = i + 2) {
            System.out.println(i);
        }


        // 3. O(log n)
        for (int i = n; i > 0; i = i / 2) {
            System.out.println(i);
        }



        // 4. O(n^2)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(i + " " + j);
            }
        }



        // 5. O(n^3)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }














    }





}
