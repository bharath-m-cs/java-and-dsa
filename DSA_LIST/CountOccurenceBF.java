package CodingExercise;

public class CountOccurenceBF {
    public static void main(String[] args) {
      //  brute force approach
        int [] arr = { 1,1,1,2,2,3,3,};
        int target = 1;
        int count =0;
        for (int i =0 ; i< arr.length;i++)
        {
            if(arr[i]== target)
                count++;
        }
        System.out.println(" the count is " + count );

    }
}
