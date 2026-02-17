import java.util.Scanner;

public class GreetingWithTime {


    static void greetUser( String name , String TimeOfDay )
    {
        System.out.println(" Hello " + " Good " + TimeOfDay +" " + name   );

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter Your Name ");
        String name = sc.nextLine();
        System.out.println(" Enter The Time of Day  ( Morning , Afternoon , Evening )");
        String TimeofDay = sc.nextLine();
        greetUser(name, TimeofDay);

    }
}
