public class Solution {
    public int searchMatrix(int[][] A, int B) {
        int l=0;
        int h=A.length-1;int h2=A[0].length-1;
        if(h==0&&h2==0)
        return A[0][0]==B?1:0;
        if(A[h][A[0].length-1]==B)
        return 1;
        if(h>0)
        {
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(A[mid][0]==B)
            return 1;
            else if(A[mid][0]>B)
            h=mid-1;
            else
            l=mid+1;
        }
        }
        else
        l=h;
        if(h<0)
        return 0;
        int l1=0;
        if(h2>0)
        {
        while(l1<=h2)
        {
            int mid=(l1+h2)/2;
            if(A[h][mid]==B)
            return 1;
            else if(A[h][mid]>B)
            h2=mid-1;
            else
            l1=mid+1;
        }
        }
        return 0;
    }
}
