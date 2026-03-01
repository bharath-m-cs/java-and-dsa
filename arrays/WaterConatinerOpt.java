package CodingExercise;

public class WaterConatinerOpt {

    public static void main(String[] args) {
        int [] height = {1,8,6,2,5,4,8,3,7};


        int lp=0,rp=height.length-1;
        int maxWater =0;
        while(lp<rp)
        {
            int width = rp-lp;
            int length = Math.min(height[lp],height[rp]);
            int currentWater = width*length;

            if (currentWater>maxWater)
            {
                maxWater= currentWater;
            }

            if (height[lp]<height[rp])
            {
                lp++;
            }
            else
            {
                rp--;
            }
        }
        System.out.println(" max water area is " + maxWater);
    }




}
