public class Solution {
public int reverse(long A) {
    int neg=0;
    if(A<0)
     neg=1;
    else
     neg=0;
    long x=(long)Math.abs(A);
    long rev=0;
    while(x!=0)
    {
        long k=x%10;
        rev=rev*10+k;
        x=x/10;
    }
    if(rev>Integer.MAX_VALUE)
    return 0;
    if(neg==1)
    rev=rev*-1;
    return (int)rev;
}
}
