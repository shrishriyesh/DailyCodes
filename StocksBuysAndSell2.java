public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxProfit(final int[] A) {
    int n=A.length;
    if(n==0)
    return 0;
    int dp[]=new int[n];
    dp[0]=0;
    for(int i=1;i<n;i++)
        {
            if(A[i]>A[i-1])
               {
                   dp[i]=dp[i-1]+(A[i]-A[i-1]);
                   
               }
            else
                dp[i]=dp[i-1];
            }
        return dp[n-1];
    }
}
