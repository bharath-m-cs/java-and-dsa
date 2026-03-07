package CodingExercise;

public class OperationsOnArray {

    static void traverseArray( int []arr , int size)
    {

        for ( int i =0 ; i<size;i++)
        {
            System.out.print(arr[i]+ " ");
            System.out.println();

        }

    }

    static  void insertAtBeginning ( int []arr, int size, int x )
    {
        for (int i =size;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
    arr[0]=x;
        System.out.println(" the array elements after insertion are ");

    }

    public static void main(String[] args) {
        int [] arr = new int[100];
        int size =5;
        arr[0] = 10;
        arr[1]= 34;
        arr[2]=18;
        arr[3]=7;
        arr[4]=23;



traverseArray(arr,size);
insertAtBeginning(arr,size,20);
size++;
traverseArray(arr,size);
    }
}
