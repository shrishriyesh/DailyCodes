public class Solution {
    public int findMinXor(int[] A) {
        int min=Integer.MAX_VALUE;
        Arrays.sort(A);
        for(int i=0;i<A.length-1;i++)
        {
                if((A[i]^A[i+1])<min)
                min=A[i]^A[i+1];
        }
        return min;
    }
}
