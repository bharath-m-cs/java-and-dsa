import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The No of Students:");
        int n = sc.nextInt();

        int[] marks = new int[n];

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the marks of Student " + (i+1) + " : ");
            marks[i] = sc.nextInt();
        }

        // Print marks
        for (int i = 0; i < n; i++) {
            System.out.println("Marks Of Student " + (i+1) + " : " + marks[i]);
        }

        sc.close();
    }
}

