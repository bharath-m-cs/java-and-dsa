import java.util.Scanner;

public class SumReturnNoParameters {

    static int sum()
    {
        Scanner sc = new Scanner(System.in);
        int num1 , num2 , sum ;
        System.out.println(" Enter The Num 1");
        num1 = sc.nextInt();
        System.out.println("Enter The Num 2");
        num2 = sc.nextInt();
        sum = num1+num2;
        return sum;

    }

    public static void main(String[] args) {

        int result = sum();
        System.out.println(" Sum  is " + result  );


    }





}
