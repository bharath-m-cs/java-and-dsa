import java.util.Scanner;

public class EvenOddUsingMethod {

static  int num ;
    static  void  EvenOrOdd ( )
    {

        if ( num % 2 == 0)
        {

            System.out.println(" Entered Number Is Even ");
            return;

        }
        System.out.println(" Entered Number is Odd ");

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Number ");
         num = sc.nextInt();
      EvenOrOdd();



    }
}
