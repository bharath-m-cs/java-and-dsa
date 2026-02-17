import java.util.Scanner;

public class VotingEligibility {


    static  void checkVotingEligibility (int age )
    {

        if (age <18)
        {
            System.out.println(" not eligible to vote ");
            return;
        }

        System.out.println(" Eligible to vote ");





    }









    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the age ");
        int age = sc.nextInt();
        checkVotingEligibility(age );
    }
}
