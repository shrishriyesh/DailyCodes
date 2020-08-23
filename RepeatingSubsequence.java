public class Solution {
    public int anytwo(String A) {
        int dp[][]=new int[A.length()+1][A.length()+1];
        for(int i=0;i<=A.length();i++)
        {
            for(int j=0;j<=A.length();j++)
            {
                if(i==0||j==0)
                {dp[i][j]=0;
                continue;
                }
                if(A.charAt(i-1)==A.charAt(j-1)&&i!=j)
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[A.length()][A.length()]>=2?1:0;
    }
}
