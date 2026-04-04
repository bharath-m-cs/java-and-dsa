package CodingExercise;

public class ArraySorted {

static  boolean sort(int [] a)
{
    for (int i =1 ; i< a.length;i++)
    {
        if (a[i]<a[i-1]){
            return false;
        }

    }


    return true;
}
    public static void main(String[] args) {
        int [] a = { 2,9,10,12,14};
        boolean res = sort(a);
        System.out.println(res);
    }
}
