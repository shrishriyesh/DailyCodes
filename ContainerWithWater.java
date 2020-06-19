public class Solution {
    public int maxArea(int[] A) {
        if(A.length<=1)
        return 0;
        int mul=1;
        int mulmax=1;
        int l=0;int h=A.length-1;
        while(h>l)
        {
            mul=(h-l)*(int)Math.min(A[h],A[l]);
            if(mul>mulmax)
            mulmax=mul;
            if(A[h]<A[l])
            h--;
            else
            l++;
        }
        return mulmax;
    }
}
