public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProfit(final List<Integer> A) {
        int fb=Integer.MIN_VALUE;
        int sb=Integer.MIN_VALUE;
        int ss=0,fs=0;
        for(int i=0;i<A.size();i++)
        {
            fb=Math.max(fb,-A.get(i));
            fs=Math.max(fs,A.get(i)+fb);
            sb=Math.max(sb,fs-A.get(i));
            ss=Math.max(ss,A.get(i)+sb);
        }
        return ss;        
    }
}
