package DSA.Hashing;

import java.util.HashMap;
import java.util.Map;

public class FindinngMax {


    public static void main(String[] args) {

        int [] arr= { 1,2,3,2,1,4,1};

        int maxCount =0;
        int maxElement =0;

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int x : arr)
        {


            map.put(x,map.getOrDefault(x,0)+1);
        }
        System.out.println(map);

for (Map.Entry<Integer,Integer> entry : map.entrySet())
{
int key = entry.getKey();
int value =entry.getValue();




if(value>maxCount)
{ maxCount= value;
    maxElement= key ;

}



}
        System.out.println(" the maximum element is " + maxElement+ " having count " + maxCount);
    }
}
