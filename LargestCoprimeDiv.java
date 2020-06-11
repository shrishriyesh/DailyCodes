public class Solution {
    public int cpFact(int A, int B) {
    // {int max=1;
    // if(gcd(A,B)==1)
    // return A;
    //     for(int i=2;i<=A/2;i++)
    //     {
    //         if((A%i)==0)
    //         {
    //             if(gcd(i,B)==1)
    //             max=i;
    //         }
    //     }
    //     return max;
    // }
    // public int gcd(int a, int b)
    // { int out=1;
    //     for(int i=2;i<=Math.min(a,b);i++)
    //     {
    //         if((a%i==0)&&(b%i==0))
    //       { out=i;
    //         return out;
    //     }}
    //     return out;
    while(gcd(A,B)!=1){
    A = A / gcd(A,B);
    }
    return A;
    }

    public int gcd(int A, int B) {
    if(B==0){
    return A;
    }
    return gcd(B,A%B);
    }
    
}
