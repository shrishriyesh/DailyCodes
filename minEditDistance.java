public class Solution {
    public int minDistance(String A, String B) {
        
    int dp[][]=new int[A.length()+1][B.length()+1];
    for(int i=0;i<dp.length;i++)
    {
        for(int j=0;j<dp[i].length;j++)
        {
            if(i==0)
            {
                dp[i][j]=j;
                continue;
            }
            if(j==0)
            {
                dp[i][j]=i;
                continue;
            }
            if(A.charAt(i-1)==B.charAt(j-1))
            dp[i][j]=dp[i-1][j-1];//Math.min(Math.min(dp[i-1][j-1],dp[i][j-1]),dp[i-1][j]);
            //Min is not taken as in cases where just a letter has to be deleted and nothing else
            //correct ans wont be taken:"AA","AAA"
            else
            dp[i][j]=1+Math.min(Math.min(dp[i-1][j-1],dp[i][j-1]),dp[i-1][j]);
        }
    }
    return dp[A.length()][B.length()];
}
}
