package DSA;

public class OperationsOnArray {

    static void traverseArray( int []arr , int size)
    {
        System.out.println("the elements of array are ");
        for ( int i =0 ; i<size;i++)
        {
            System.out.print(arr[i]+ " ");



        }
        System.out.println();

    }

    static  void insertAtBeginning ( int []arr, int size, int x )
    {
        for (int i =size;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
    arr[0]=x;



    }

    static void insertatEnd ( int [] arr, int size , int x)
    {
        arr[size] = x;
    }
    static void insertAtPosition(int [] arr , int size, int pos, int x)
    {
        for (int i = size ; i >= pos; i--)
        {
            arr[i]=arr[i-1];
        }
        arr[pos-1] = x;
    }
    public static void main(String[] args) {
        int [] arr = new int[100];
        int size =5;
        arr[0] = 10;
        arr[1]= 34;
        arr[2]=18;
        arr[3]=7;
        arr[4]=23;


//
traverseArray(arr,size);
insertAtBeginning(arr,size,20);
size++;
        System.out.println(" After insertion ");
traverseArray(arr,size);
insertatEnd(arr,size,9);
size++;
traverseArray(arr,size);
insertAtPosition(arr,size,3,1);
size++;
traverseArray(arr,size);

    }
}
