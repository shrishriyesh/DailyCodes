public class Solution {
    public int uniquePathsWithObstacles(int[][] A) {
        int dp[][]=new int[A.length][A[0].length];
        for(int i=0;i<A[0].length;i++)
        {
            if(A[0][i]==1)
            break;
            dp[0][i]=1;
        }
        for(int i=0;i<A.length;i++)
        {
            if(A[i][0]==1)
            break;
            dp[i][0]=1;
        }
        for(int i=1;i<A.length;i++)
        {
            for(int j=1;j<A[0].length;j++)
            {
                if(A[i][j]==1)
                continue;
                else
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[A.length-1][A[0].length-1];
    }
}
