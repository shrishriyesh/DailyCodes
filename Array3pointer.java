public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int minimize(final int[] A, final int[] B, final int[] C)
    {
        int i=0;int j=0;int k=0;
        int min=Integer.MAX_VALUE;
        int max=0;
        while(i<A.length&&j<B.length&&k<C.length)
        {   int a=Math.abs(A[i]-B[j]);
            int b=Math.abs(B[j]-C[k]);
            int c=Math.abs(C[k]-A[i]);
            max=Math.max(a,Math.max(b,c));
            if(max<min)
            min=max;
            if(max==a)
            {
                if(A[i]>B[j])
                j++;
                else
                i++;
            }
            else if(max==b)
            {
                if(B[j]>C[k])
                k++;
                else
                j++;
            }
            else
            {
                if(C[k]>A[i])
                i++;
                else
                k++;
            }
        }
        return min;
        
    }
}
