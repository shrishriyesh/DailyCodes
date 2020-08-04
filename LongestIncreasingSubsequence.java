public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int lis(final List<Integer> A) {
        int dp[]=new int[A.size()];
        for(int i=0;i<dp.length;i++)
        dp[i]=1;
        for(int i=1;i<A.size();i++)
        {
            for(int j=0;j<i;j++)
            {
                if(A.get(i)>A.get(j))
                if(dp[i]<dp[j]+1)//check if the number of smaller occurrences before is greater or not
                dp[i]=dp[j]+1;
            }
        }
        int max=1;
        for(int i=0;i<dp.length;i++)
        {
            if(max<dp[i])
            max=dp[i];
        }
        return max;
    }
}
