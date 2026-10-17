package OOPS;



// METHOD OVERLOADING




public class oop2 {



    public int add( int a , int b)
    {

        int c = a+b;
        return c ;
    }


    public int add( int a , int b , int c )
    {

        int x = a+b+c;
        return x;
    }
    public double add( double a , double b)
    {
         double x = a+b ;
        return x;
    }



    public static void main(String[] args) {


        oop2 obj = new oop2();
        int sum1= obj.add(2,3);
        int sum2 = obj.add(2,3,4);
         double sum3 = obj.add(2,3);

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
