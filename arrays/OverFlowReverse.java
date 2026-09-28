package DSA.BasicArrays;

class OverFlowReverse {
    public int reverse(int x) {



        int  original = x;
        int rev = 0;
        while(x!=0 )
        {
            int n = x %10;
            rev = rev*10 + n ;
            x= x/10;

        }

        return rev;


    }
}