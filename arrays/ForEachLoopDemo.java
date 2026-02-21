package JavaArrays;

public class ForEachLoopDemo {


    public static void main(String[] args) {
        int [] numbers = { 20 , 30, 40 , 60 };

        for (int i =0 ; i<numbers.length; i++) // traditional for loop
        {
            System.out.println(numbers[i]);
        }

        System.out.println();

        for (int x : numbers)  // for each loop
        {
            System.out.println(x);
        }
    }

}
