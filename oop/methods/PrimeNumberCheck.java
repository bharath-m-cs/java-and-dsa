import java.util.Scanner;

public class PrimeNumberCheck {


    static void checkPrime(int num)
    {
        if (num<=1)
        {
            System.out.println(" it is not prime ");
            return ;
        }

        for (int i = 2; i<=Math.sqrt(num) ; i++)
        {
            if (num%i ==0  )
            {
                System.out.println(" it is not prime ");
                return;
            }





        }
        System.out.println(" it is prime ");

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number  ");
        int num = sc.nextInt();
        checkPrime(num);
    }
}
