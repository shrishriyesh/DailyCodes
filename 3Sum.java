public class Solution {
    public int threeSumClosest(int[] A, int B) {
        long sum=Integer.MAX_VALUE;long tempSum=Integer.MAX_VALUE;int diff=Integer.MAX_VALUE; 
    //       for(int i=0; i<A.length; i++){
    //     for(int j=i+1; j<A.length; j++){
    //         for(int k=j+1; k<A.length; k++){
    //             if(Math.abs((long)A[i]+(long)A[j]+(long)A[k]-(long)B) < tempSum){
    //                 sum = (long)A[i]+(long)A[j]+(long)A[k];
    //                 tempSum = Math.abs(sum-(long)B);
    //                 if(sum==B)
    //                     return (int)sum;
    //             }
    //         }
    //     }
    // }
    // return (int)sum;
    Arrays.sort(A);
    for(int i=0;i<A.length-2;i++)
    {
        int j=i+1;int k=A.length-1;
        while(j<k)
        {
            sum=A[i]+A[j]+A[k];
            if(sum==B)
            return B;
            else if(sum>B)
            k--;
            else
            j++;
            if(Math.abs(sum-B)<diff)
            {tempSum=sum;
            diff=(int)Math.abs(sum-B);}
        }
    }
    return (int)tempSum;
}
    }

