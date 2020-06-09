public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maximumGap(final List<Integer> A) {
        if(A.size()<2)
        return 0;
        Collections.sort(A);
        int maxdiff=Integer.MIN_VALUE;
        for(int i=0;i<A.size()-1;i++)
        {
            if(A.get(i+1)-A.get(i)>maxdiff)
            {
                maxdiff=A.get(i+1)-A.get(i);
            }
        }
        return maxdiff;
    }
}
