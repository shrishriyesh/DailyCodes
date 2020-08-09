public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int longestSubsequenceLength(final List<Integer> A) {
        
        if(A.size() == 0) {
            return 0;
        }
        
        int size = A.size();
        int[] incr = new int[size], decr = new int[size];
        for(int i = 0; i<size; i++) {
            incr[i] = 1;
            decr[i] = 1;
        }
        
        for(int i = 1; i<size; i++) {
            for(int j=0;j<i;j++)
            {
                if(A.get(j)<A.get(i))
                {
                    incr[i]=Math.max(incr[j]+1,incr[i]);
                }
            }
        }
        //longest decreasing subsequence
        for(int i = size - 2; i >= 0; i--) {
            int cur = A.get(i);
            for(int j=size-1;j>i;j--)
            {if(A.get(j)<A.get(i))
            {
                decr[i]=Math.max(decr[j]+1,decr[i]);
            }

            
            }
        }
        
        int ans = 0;
        for(int i = 0; i<size; i++) {
            int cur = incr[i] + decr[i];
            if(cur > ans) {
                ans = cur;
            }
        }
        
        return ans - 1;
    }
}
