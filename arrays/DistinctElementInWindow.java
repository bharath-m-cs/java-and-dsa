package DSA.SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;

class DistinctElementInWindow {
    ArrayList<Integer> countDistinct(int arr[], int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        list.add(map.size());

        for (int r = k; r < arr.length; r++) {


            map.put(arr[r-k], map.get(arr[r-k]) - 1);

            if (map.get(arr[r-k]) == 0) {
                map.remove(arr[r-k]);
            }

            map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);

            list.add(map.size());
        }

        return list;
    }
}