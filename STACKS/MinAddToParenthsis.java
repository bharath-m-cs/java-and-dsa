package DSA.Stacks;

class MinAddToParenthsis {
    public int minAddToMakeValid(String s) {
        int open_bracket=0;
        int close_bracket=0;

        for( int i=0 ; i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                open_bracket++;

            }
            else
            {
                if(open_bracket==0)
                {
                    close_bracket++;
                }
                else
                {


                    open_bracket = Math.max(open_bracket-1,0);

                }
            }
        }
        return open_bracket+close_bracket;
    }
}