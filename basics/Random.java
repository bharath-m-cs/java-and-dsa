package DSA.BasicArrays;

public class Random {

    public static void main(String[] args) {
        int [] a= { 1,2,3,4,5};

        for (int i =0 ; i<=((a.length)/2);i++)
        {
            System.out.println(a[i]);

        }
        for (int i =a.length-1 ; i>((a.length)/2);i--)
        {
            System.out.println(a[i-1]);
            System.out.println(a[i]);


        }

    }
}
