package DSA.SlidingWindow;

class MaxVowellnsubstring{
    public int maxVowels(String s, int k) {


        int count =0 ;
        for( int i =0 ; i<k ; i++)
        {

            if( s.charAt(i) == 'a' || s.charAt(i) =='e' || s.charAt(i) =='i' || s.charAt(i) =='o' || s.charAt(i) =='u')
            {
                count ++;
            }
        }


        int max = count ;


        for( int r = k ; r<s.length() ; r++)
        {
            if( s.charAt(r) == 'a' || s.charAt(r) =='e' ||s.charAt(r) == 'i' ||s.charAt(r) == 'o' || s.charAt(r) =='u')
            {
                count++;
            }


            if( s.charAt(r-k) == 'a' || s.charAt(r-k) =='e' || s.charAt(r-k) =='i' || s.charAt(r-k) =='o' || s.charAt(r-k) =='u')
            {
                count--;
            }


            max = Math.max( count ,max);



        }

        return max ;
    }
}