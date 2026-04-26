package DSA.Prefix;

public class EqullibriumPoint {

static  int equillibrium (int a[])
{
    int lSum =0;
    int rSum = 0;
    int n = a.length;

    int totalSum=0;

    for (int i =0;i<n;i++)
    {

   totalSum = totalSum+a[i];

    }
    for (int i =0 ; i<n;i++)
    {

         rSum = totalSum-lSum-a[i];
         if (rSum==lSum)
         {
             return i;
         }
         lSum= lSum+a[i];
    }
    return -1;


}
    public static void main(String[] args) {
        int [] a = { 2,3,10,4,5,1};
        int res = equillibrium(a);
        System.out.println(res);
    }
}
