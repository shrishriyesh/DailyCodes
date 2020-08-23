int Solution::isMatch(const string A, const string B) 
{
    int n=A.size();
    int m=B.size();
    bool dp[n+1][m+1];
    memset(dp, false, sizeof(dp)); 
    dp[0][0]=true;
    for(int j=1;j<=m;j++)
    {
        if(B[j-1]=='*')
            dp[0][j]=dp[0][j-1];
    }
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=m;j++)
        {
            if(B[j-1]=='*')
            {
                dp[i][j]=(dp[i][j-1] || dp[i-1][j]);
            }
            else if(B[j-1]=='?')
            {
                dp[i][j]=dp[i-1][j-1];
            }
            else if(A[i-1]==B[j-1])
            {
                dp[i][j]=dp[i-1][j-1];
            }
            else
            {
                dp[i][j]=false;
            }
        }
    }
    if( dp[n][m])
    return 1;
    else
    return 0;
}
