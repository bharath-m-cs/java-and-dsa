import java.util.Scanner;

public class SimpleCalculatorMethods {


    static  void sum()
    {
        Scanner sc = new Scanner( System.in);
        int num1 , num2 , sum;
        System.out.println(" Enter the Num 1");
          num1 = sc.nextInt();
        System.out.println(" Enter the Num 2 ");
        num2 = sc.nextInt();
        sum = num1 + num2 ;
        System.out.println(" The sum is " + sum);


    }


    static  void Sub()
    {
        Scanner sc = new Scanner( System.in);
        int num1 , num2 , Sub;
        System.out.println(" Enter the Num 1");
        num1 = sc.nextInt();
        System.out.println(" Enter the Num 2 ");
        num2 = sc.nextInt();
        Sub = num1 - num2 ;
        System.out.println(" The Subtraction of " + num1 + " and " + num2 + " is " +Sub);
    }




    static  void Multiplication()
    {
        Scanner sc = new Scanner( System.in);
        int num1 , num2 , product;
        System.out.println(" Enter the Num 1");
        num1 = sc.nextInt();
        System.out.println(" Enter the Num 2 ");
        num2 = sc.nextInt();
        product = num1 * num2 ;
        System.out.println(" The Product of "+ num1 +" and " + num2 + " is " + product);

    }

    static  void Division()
    {
        Scanner sc = new Scanner( System.in);
        int num1 , num2 , Division;
        System.out.println(" Enter the Num 1");
        num1 = sc.nextInt();
        System.out.println(" Enter the Num 2 ");
        num2 = sc.nextInt();
        Division = num1 / num2;
        System.out.println(" The Division of "+ num1 + " and "+ num2 +" is " + Division);

    }

    public static void main(String[] args) {

        while( true )
        {
        Scanner sc = new Scanner(System.in);
        System.out.println(" -------------------------------");
        System.out.println(" Welcome to Calculator Menu ");
        System.out.println("---------------------------------");
        System.out.println(" 1. ADDITION ");
        System.out.println(" 2. SUBTRACTION ");
        System.out.println(" 3. MULTIPLICATION");
        System.out.println(" 4. DIVISION ");
            System.out.println(" 5 . Exit ");
        System.out.println("  Enter Your Choice ");
        int choice =  sc.nextInt();

        switch (choice ) {

            case 1:
                sum();

                break;

            case 2:
                Sub();

                break;

            case 3:
                Multiplication();

                break;

            case 4:
                Division();
                break;

            case 5 :
                System.out.println(" Exiting ......");
                return ;


            default:
                System.out.println(" Invalid Choice ");


        }

        }



    }

}
