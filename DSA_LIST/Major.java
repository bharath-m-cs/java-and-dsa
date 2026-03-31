package CodingExercise;

public class Major {


    static  int major(int [] arr )
    {  int majorelement=0;
        int count =0;
        for(int i =0;i< arr.length;i++)
        {

            if(count==0) {
                majorelement = arr[i];
            }
            if(arr[i]==majorelement)
            {
                count++;

            }
            else
            {
                count--;
            }


        }

        return majorelement;
    }


    public static void main(String[] args) {


        int [] arr = { 2,1,1,1,3 };
        int res = major(arr);
        System.out.println(res);
    }
}
