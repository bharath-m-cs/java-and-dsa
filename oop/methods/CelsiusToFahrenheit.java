import java.util.Scanner;

public class CelsiusToFahrenheit {


    static  int ConvertFahrenheit ( int Celsius )
    {
        int FarhenHeit = (9/5 ) * Celsius +32 ;
        return FarhenHeit;
    }






    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter The Temperature In Celsius ");
        int Celsius  = sc.nextInt();

        int Result  = ConvertFahrenheit(Celsius);
        System.out.println(" Coverted  FahrenHeit Answer Is " + Result);
    }
}
