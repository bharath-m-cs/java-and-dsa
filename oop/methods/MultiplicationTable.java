import java.util.Scanner;

public class MultiplicationTable {



   static  void printMultiplicationTable( int num )
   {
       System.out.println(" The Multiplication Table of " + num);
       for (int i = 1; i<=10 ; i++)
       {

          int res  = num*i;
           System.out.println(num +" * "+ i +" = "+ res);
       }
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter The Number ");
        int  num = sc . nextInt();
        printMultiplicationTable(num);

    }

}
