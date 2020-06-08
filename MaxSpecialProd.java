public class Solution {
    public int maxSpecialProduct(int[] A) {
        long max=0;
        for(int i=1;i<A.length-1;i++)
        {
            long l=0;
            long r=0;
            for(int j=i-1;j>=0;j--)
            {
                if(A[j]>A[i])
                {
                    l=j;
                    break;
                }
            }
            for(int j=i+1;j<A.length;j++)
            {
                if(A[j]>A[i])
                {
                    r=j;
                    break;
                }
            }
            if(l*r>max)
            max=(long)l*r;
        }
        return (int) (max%1000000007);
    }
}
