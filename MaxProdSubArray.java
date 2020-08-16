public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProduct(final List<Integer> A) {
        int currmax=A.get(0);
        int currmin=A.get(0);
        int prevmax=A.get(0);
        int prevmin=A.get(0);
        int ans=A.get(0);
        for(int i=1;i<A.size();i++)
        {
            currmax=Math.max(prevmax*A.get(i),Math.max(prevmin*A.get(i),A.get(i)));
            currmin=Math.min(prevmax*A.get(i),Math.min(prevmin*A.get(i),A.get(i)));
            ans=Math.max(ans,currmax);
            prevmax=currmax;
            prevmin=currmin;
        }
        return ans;
    }
}
