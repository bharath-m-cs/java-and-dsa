package DSA.Greedy;

public class MinimumPlatforms {




    static  int minimumPlatforms(int [] at, int [] dt)
    {

        int count = 0;
        int maxCount=0;
        for (int i =0 ; i<at.length;i++)
        {
            count = 1;
            for (int j = i+1; j<at.length;j++)
            {
              if(   at[j]<dt[i])
              {
                  count++;
              }

              maxCount= Math.max(count,maxCount);
            }

        }

        return maxCount;

    }
    public static void main(String[] args) {
        int [] arrivalTime = { 900, 940,950,1125,1500,1950};
        int [] departureTime = { 910, 945,1120,1130,1900,2000};


        int minPlatform = minimumPlatforms(arrivalTime,departureTime);
        System.out.println(minPlatform);
    }
}
