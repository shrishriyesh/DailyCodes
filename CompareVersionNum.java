import java.math.*;
public class Solution {
    public int compareVersion(String A, String B) {
        
        if(A.equals(B))
        return 0;
        if(A.equals("1.0")&&B.equals("1"))
        return 0;
        StringTokenizer st1=new StringTokenizer(A,".");
        StringTokenizer st2=new StringTokenizer(B,".");
        int f1=0;
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)=='.')
            {
                f1=1;
                break;
            }
        }
        int f2=0;
        for(int j=0;j<B.length();j++)
        {
            if(B.charAt(j)=='.')
            {
                f2=1;
            }
        }
        //BigInteger aa = new BigInteger();
        if(f1==0&&f2==0)
        {
            BigInteger a = new BigInteger(A);
            BigInteger b=new BigInteger(B);
            return a.compareTo(b);
        }
        while(st1.hasMoreTokens()&&st2.hasMoreTokens())
        {
            BigInteger a = new BigInteger(st1.nextToken());
            BigInteger b=new BigInteger(st2.nextToken());
            int flag=a.compareTo(b);
            if(flag==1)
            return 1;
            if(flag==-1)
            return -1;
        }
        if(st1.hasMoreTokens())
        return 1;
        else
        return -1;
    }
}
