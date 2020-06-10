public class Solution {
    public int titleToNumber(String A) 
    {
        if(A.length()==1)
        {
            return (A.charAt(0)-'A')+1;
        }
        else
        {   int i=A.length()-1;
        int pow=0;
        int sum=0;
            while(i>=0)
            {
                int num=A.charAt(i)-'A'+1;
                sum=sum+num*(int)Math.pow(26,pow);
                i--;
                pow++;
            }
            return sum;
        }
    }
}
