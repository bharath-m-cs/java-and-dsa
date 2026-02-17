import java.util.Scanner;

public class CircleCalculator {

    static  void calculateAreaAndCircumference(double  r )
    {
        double  area = Math.PI * r * r;
        double  circumference =2 *Math.PI *r;
        System.out.println(" area is " + area );
        System.out.println(" circumfrence is " + circumference);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Radius ");
        double  radius = sc.nextDouble();
        calculateAreaAndCircumference(radius);

    }
}
