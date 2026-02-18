public class MethodOverloading {


    static int calculate(int a , int b)
    {
        return a+b;
    }

    static  double calculate (double a, double b )

    {
        return a*b;
    }

    static int  calculate(  int a , int b , String operation  )
    {
        switch(operation)
        {
            case "+"  : return a+b ;
            case "-" : return a-b;
            case "*" : return a*b ;
            case "/" :

                if (b==0)
                {
                    System.out.println(" Error Division By Zero Is Undefined ");
                   return 0;
                }

                    return a/b;

            default:
                System.out.println(" Not a Valid Choice ");
                return 0 ;


        }
    }


    public static void main(String[] args) {

        System.out.println(calculate(2,4));
        System.out.println(calculate(2.6,4.5));
        System.out.println(calculate(2,3,"+"));
        System.out.println(calculate(4,5,"-"));
        System.out.println(calculate(6,7,"*"));
        System.out.println(calculate(14,8,"/"));
        System.out.println(calculate(8,0,"/"));
        System.out.println(calculate(2,3,"&"));



    }


}
