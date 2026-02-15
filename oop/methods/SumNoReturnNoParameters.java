import java.util.Scanner;

public class SumNoReturnNoParameters {

    static  void sum()
    {
        Scanner sc = new Scanner(System.in);
        int num1 , num2 , sum;
        System.out.println(" Enter Num 1 ");
        num1 = sc.nextInt();
        System.out.println(" Enter Num 2 ");
        num2 = sc.nextInt();
        sum = num1+num2;
        System.out.println(" The Sum of " + num1 + " and " + num2 + " is "+ sum);




    }

    public static void main(String[] args) {
        sum();
    }












}
