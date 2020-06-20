public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] searchRange(final int[] A, int B) 
    {
        int out[]=new int[2];
        int l=0;
        int h=A.length-1;
        int first=-1;
        int last=-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(A[mid]==B)
            {
                first=mid;
                h=mid-1;
            }
            else if(A[mid]>B)
            {
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        l=0;
        h=A.length-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(A[mid]==B)
            {
                last=mid;
                l=mid+1;
            }
            else if(A[mid]>B)
            {
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        out[0]=first;
        out[1]=last;
        return out;
    }
}
