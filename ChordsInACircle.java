public class Solution {
    // public long chordCnt(long A) {
    //      long C=BC(2*A,A);
    //     return (C/(A+1))%1000000007;
    // }
    // public long BC(long n,long k)
    // {
    //      long res=1;
    //     for(long i=0;i<k;i++)
    //     {
    //         res=(res*(n-i));
    //         res=(res/(i+1));
    //     }
    //     return res;
    // }
      public int chordCnt(int A) {
        long [] dp = new long[A+1];
        
        dp[0]=1;
        dp[1]=1;
        
        for(int i=2;i<=A;i++){
            
            for(int k=0;k<i;k++){
                dp[i]=(dp[i]+dp[k]*dp[i-1-k])%1000000007;
            }
        }
        
        return (int)dp[A];
    }
}
