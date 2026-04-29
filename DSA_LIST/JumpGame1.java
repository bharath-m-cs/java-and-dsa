package DSA.Greedy;

public class JumpGame1 {
static  boolean jump (int a[])
{


    int maxIndex = 0;
    int fmax =0;
    for (int i =0 ; i<a.length;i++)
    {

 if(i>fmax)
 {
     return false;
 }


 maxIndex = a[i]+i;

 fmax = Math.max(maxIndex,fmax);



    }
    return true;
}

    public static void main(String[] args) {
        int a[] ={ 1,2,4,1,1,0,2,5};
        boolean res = jump(a);
        System.out.println(res);


    }
}
