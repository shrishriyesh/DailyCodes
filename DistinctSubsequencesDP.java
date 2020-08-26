public class Solution {
    public int numDistinct(String A, String B) 
     {
     
        int dp[][]=new int[B.length()+1][A.length()+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                if(i==0||j==0)
                {
                    dp[i][j]=0;
                    continue;
                }
                if(i==1)
                {
                    if(B.charAt(i-1)==A.charAt(j-1))
                    {
                        dp[i][j]=dp[i][j-1]+1;
                        continue;
                    }
                }
                if(B.charAt(i-1)==A.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1]+dp[i][j-1];
                }
                else
                dp[i][j]=dp[i][j-1];
            }
        }
        return dp[dp.length-1][dp[0].length-1];
}


}
