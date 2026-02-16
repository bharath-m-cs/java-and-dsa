import java.util.Scanner;

public class GreetingUsingMethods {

    static  String name ;


    static  void  GreetMorning ()
    {
        System.out.println(" Hello " + name + " Good Morning !");
        return;



    }


    static void GreetAfternoon ()
    {
        System.out.println(" Hello" + name +"  Good Afternoon! ");
        return ;
    }


    static void GretEvening ()
    {

        System.out.println(" Hello " + name + "Good Evening! ");
        return;
    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Your Name ");
         name = sc.nextLine();
        System.out.println("-------------------------");
        System.out.println(" Morning (1) ");
        System.out.println(" Afternoon (2)");
        System.out.println(" Evening (3)");
        System.out.println("--------------------------");
        System.out.println(" Select The Timings ");
        int ch = sc.nextInt();

        switch (ch )
        {
            case 1 :
                GreetMorning();
            break;


            case 2 : GreetAfternoon();

            break;


            case 3 : GretEvening();
            break;

            default: return;

        }

    }

}
