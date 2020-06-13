public class Solution {
    public int romanToInt(String A) {
        int sum=0;
        int csub=0;
        int xsub=0;
        int isub=0;
        for(int i=A.length()-1;i>=0;i--)
        {
            if(A.charAt(i)=='I'&& isub==0)
            {
                sum=sum+1;
            }
             if(A.charAt(i)=='I'&& isub==1)
            {
                sum=sum-1;
            }
            if(A.charAt(i)=='V')
            {
                sum=sum+5;
                isub=1;
            }
            if((A.charAt(i)=='X')&&(xsub==0))
            {
                sum=sum+10;
                isub=1;
            }
            if((A.charAt(i)=='X')&&(xsub==1))
            {
                sum=sum-10;
            }
            if(A.charAt(i)=='L')
            {
                sum=sum+50;
                xsub=1;
            }
            if((A.charAt(i)=='C')&&(csub==0))
            {
                sum=sum+100;
                xsub=1;
            }
            if((A.charAt(i)=='C')&&(csub==1))
            {
                sum=sum-100;
            }
            if(A.charAt(i)=='D')
            {
                sum=sum+500;
                csub=1;
            }
            if((A.charAt(i)=='M'))
            {
                sum=sum+1000;
                csub=1;
            }
        }
        return sum;
    }
}
