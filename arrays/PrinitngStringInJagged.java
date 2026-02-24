package CodingExercise;

public class PrinitngStringInJagged {



    static void dipplay( String [][] arr)
    {

       for ( int i =0 ;i< arr.length;i++)
       {

           for (int j=0 ;  j< arr[i].length;j++)
           {

               System.out.print(arr[i][j]+ " ");

           }
           System.out.println();
       }


    }





    public static void main(String[] args) {
        String  [][] jaggedArray = { { " bharu ", " mahesh ", " mamatha"}, { " Dileep ", " Punith ", " Abhi "}, { " sanju " , "Anju "}};


           dipplay(jaggedArray);

    }
}
