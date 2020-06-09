public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> findPerm(final String A, int B) {
        int l=1;int h=B;
        ArrayList<Integer> out=new ArrayList<>();
        for(int i=0;i<B-1;i++)
        {
            if(A.charAt(i)=='D')
            {
                out.add(h);
                h--;
            }
            else
            {out.add(l);
            l++;}
        }
        out.add(l);
        return out;
    }
}
