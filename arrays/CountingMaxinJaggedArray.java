package CodingExercise;

public class CountingMaxinJaggedArray {




    static  void  max ( int [][] arr)
    {
        int max =Integer.MIN_VALUE;
        for (int i =0 ; i< arr.length;i++)
        {

            for (int j =0 ; j< arr[i].length; j++)
            {
                 max =Integer.MIN_VALUE;
                if (arr[i][j] >max)

                {
                    max = arr[i][j];

                }

            }
            System.out.println(" the max element in "+ (i+1) + "th " +"row is "  + max);
        }

    }

    public static void main(String[] args) {

        int [][]  jaggedArray = { {-1,0}, {3,4,5}, {6,7,8}};


        max(jaggedArray);







    }





}
