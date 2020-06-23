public class Solution {
    public int nTriang(int[] A) 
    {   long ans=0;
    Arrays.sort(A);
        if(A.length==3)
        {
            if(A[0]+A[1]>A[2])
            return 1;
            else return 0;
        }
        
        for(int i=A.length-1;i>=2;i--)
        {
            int j=0;int k=i-1;
            while(j<k)
            {
                long sum=A[j]+A[k];
                if(sum>A[i])
                {
                     ans=(ans+(k-j))%1000000007;
                    k--;
                }
                else
                {
                    j++;
                }
            }
        }
        return (int)ans%1000000007;
        
    }
}
