package DSA.Prefix;

public class SubarraysWithSum {


    static  int maxNum(int [] a, int targetSum)
    {
        int count =0;
        for (int i = 0 ; i<a.length;i++)
        {

            for (int j = i; j<a.length;j++)
            {

                int sum=0;
                for (int k =i ; k<=j;k++)
                {
                    sum = sum+a[k];

                }

                if (sum== targetSum)
                {
                    count++;
                }
            }
        }

        return count;

    }

// 2. better solution

    static  int maxNumB(int [] a, int targetSumb)
    {
        int count =0;
        for (int i = 0 ; i<a.length;i++)
        {
int sum = 0;
            for (int j = i; j<a.length;j++) {

                sum = sum + a[j];
                if (sum== targetSumb)
                {
                    count++;
                }
            }



        }

        return count;

    }


    public static void main(String[] args) {
        int [] a = { 1,2,3,-3,1,1,1,4,2,-3};
        int bruteSolution = maxNum(a,3);
        System.out.println(bruteSolution);

        int betterSolution = maxNumB(a,3);
        System.out.println(betterSolution);


    }
}
