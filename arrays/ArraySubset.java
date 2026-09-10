package DSA.Hashing;


import java.util.HashMap;

class ArraySubset {
    public boolean isSubset(int a[], int b[]) {
        HashMap<Integer,Integer> s = new HashMap<>();


        for( int i =0 ; i<a.length;i++)
        {
            s.put(a[i],s.getOrDefault(a[i],0)+1);
        }

        for (int i=0 ; i<b.length;i++)
        {
            if(!s.containsKey(b[i])  || s.get(b[i])==0)
            {
                return false;

            }

            s.put(b[i],s.get(b[i])-1);
        }
        return true ;

    }
}

