import java.math.BigInteger;
public class Solution {
    public int power(String A) 
    {
        if(A=="1")
        return 0;
        if(A.equals("2"))
        return 1;
        BigInteger n=new BigInteger(A);
        BigInteger two=new BigInteger("2");
        BigInteger zero=new BigInteger("0");
        while(n.mod(two).compareTo(zero)==0)
        {
            if(n.compareTo(two)==0)
            return 1;
            else
            n=n.divide(two);
        }
        return 0;
    }
}
