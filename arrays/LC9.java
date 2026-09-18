package DSA.BasicArrays;

class LC9 {
    public boolean isPalindrome(int x) {


        int original = x;


        int rev =0;

        while(x>0)
        {

            int a = x%10;
            rev = rev *10 +a;
            x= x/10;
        }


        if(original == rev)
        {
            return true;
        }
        return false;

    }
}