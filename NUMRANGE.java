public class Solution {
 // public int numRange(int[] A, int B, int C) {
//         int count = 0;
// int sum = 0;
// for(int i=0;i<A.length;i++){
// sum=0;
// for(int j=i;j<A.length;j++){
// sum += A[j];
// if(sum>=B && sum<=C)
// count +=1;
// if(sum > C)
// break;
// }
// }
// return count;
// }
public int numRange(int[] A, int B, int C) {
 int c1=count(A,B-1);
 int c2=count (A,C);
 return c2-c1;
}
public int count(int A[],int k)
{   int st=0;int end=0;int c=0;int sum=A[0];
    while(st<A.length&&end<A.length)
    {
        if(sum<=k)
        {
            end++;
            if(st<=end)
            {
                c+=end-st;
            }
            if(end<A.length)
            sum+=A[end];
        }
        else
        {
            sum=sum-A[st];
            st++;
        }
    }
    return c;
}
}
//2nd method
