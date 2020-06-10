public class Solution {
    public int trailingZeroes(int A) 
    { int c=0;
        for(int i=1;i<=A;i++)
        {int n=i;
            while(n%10==0)
            {c++;
            n/=10;}
            while(n%5==0)
            {
                c++;
                n/=5;
            }
            
        }
        return c;
    }
}
