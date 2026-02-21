package CodingExercise;

public class StringColors {

    public static void main(String[] args) {

        String [] colors = { " Blue " , " Red " , " Greeen " , " Yellow " , " Pink"};


        System.out.println(" Printing THe colors Using for each Loop ");

        for ( String x : colors)   // just printing the colors using for each loop
        {
            System.out.println(x);
        }

        System.out.println(" Printing The Colors using For Loop");

        for ( int i =0 ; i<colors.length;i++)
        {
            System.out.println(" the color is : " + colors[i] + "it  is at  index " + i);


        }



    }





}
