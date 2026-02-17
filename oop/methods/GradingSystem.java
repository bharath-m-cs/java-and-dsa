import java.util.Scanner;

public class GradingSystem {

    static  void displayStudentGrade( String studentName, String studentGrade)
    {


        System.out.println(   studentName+ " Got " + studentGrade + " Grade " );

    }


    static   String calculateGrade ( int score)
    {

        if (score >=90 && score <=100)
        {

            return  "A";
        }
        if (score >=80 && score <=89)
        {
            return  "B";
        }


        if (score >=70 && score <=79)
        {
            return "C";
        }

        if (score>=60 && score<=69)
        {
            return "D";
        }

        return "fail";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Your Name ");
        String name = sc.nextLine();;
        System.out.println("  Enter the Score");
        int score = sc.nextInt();
        String Grade = calculateGrade(score);
        displayStudentGrade(name, Grade);
    }


}

