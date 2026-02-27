package CodingExercise;

public class TwoSum {

static  void twoSum( int [] arr , int target)
{


    for (int i =0 ; i<arr.length ; i++)
    {
        for (int j = i+1; j<arr.length;j++)
        {

            if ( target == arr[i] +arr[j])
                System.out.println(" i : " + i +  " and " +" j : " +j)  ;
            return;
        }
    }
}
    public static void main(String[] args) {

        int [] arr = { 2,7,8,1,17};

twoSum(arr,9);


    }
}
