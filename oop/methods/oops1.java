package OOPS;
// consider class as COMPUTER
public class oops1 {


    public void playMusic()
    {

        System.out.println(" the music is playing");
    }



    public int Sumcalculator(int a , int b)
    {

        int c = a+b ;

        return c ;


    }






    public static void main(String[] args) {



        // creating object using the class( blue print)

        oops1 obj = new oops1();
        obj.playMusic();
        int x = obj.Sumcalculator(2,3);
        System.out.println(" the sumCalculator gives " + x);

    }
}
