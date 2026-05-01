package DSA.Prefix;

import java.util.Arrays;

public class ProductExceptSelf2 {

    static int[] productExpOptimal(int[] a) {

        int n = a.length;
        int[] res = new int[n];

        //  store prefix product
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * a[i - 1];
        }

        //  multiply with suffix product
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = res[i] * suffix;
            suffix = suffix * a[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};

        int[] res = productExpOptimal(a);
        System.out.println(Arrays.toString(res));
    }
}