package CodingExercise;

public class CountNoofElement {







    static  void display( int [][] arr)
    {

        for (int i =0 ; i< arr.length;i++)
        {
              int count = 0;
              int sum = 0 ;
            for (int j =0 ;j< arr[i].length;j++)

            {

                count++;
                sum = sum + arr[i][j];
            }

            System.out.println(" count  in " +  (i+1) +"th " + "row  is " + count);
            System.out.println(" the sum of elements in " + (i+1) +"th" + " row  is " + sum );
            System.out.println("----------------------------");
        }


    }




    public static void main(String[] args) {
        int [][] jaggedArray ={ { 1, 2}, { 4,5,6}, {7,8,9,10}};
        display(jaggedArray);


    }


}
