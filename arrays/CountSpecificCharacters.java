package CodingExercise;

public class CountSpecificCharacters {

    public static void main(String[] args) {

        char [] letters = { 'a', 'a' , 'c' , 'd' , 'e'};
        char target = 'a';
        int count = 0 ;

        for (char z : letters )
        {
            if ( z == target )
            {
                count++;
            }
        }
        System.out.println(count);





    }







}
