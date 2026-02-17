import java.util.Scanner;

public class MarketBilling {


    static  double calculateTotalPrice( int quantity , double price , boolean isMember )
    {
       double totalPrice = quantity * price;

        if ( isMember)
        {
            totalPrice = totalPrice - totalPrice*0.15;
        }
return  totalPrice;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Number of Quantity ");
        int quantity = sc.nextInt();
        System.out.println(" Enter The Price ");
        double price = sc.nextInt();
        System.out.println(" Are U a Member ");
        boolean member = sc.nextBoolean();
       double totalPrice = calculateTotalPrice(quantity,price,member);
        System.out.println(" the total Price is  " + totalPrice);


    }
}
