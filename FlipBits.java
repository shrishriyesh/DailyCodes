public class Solution {
    public int[] flip(String A) 
    {
        int start=0;
        int end=0;
        int sum=0;
        int maxsum=0;
        int total=0;
        int arr[]=new int[2];
        for(int i=0;i<A.length();i++)
        {   if(A.charAt(i)=='1')
            total++;
        }
        if(total>=A.length())
        {return new int[0];}
        for(int i=0;i<A.length();i++)
        {   char c=A.charAt(i);
            if(c=='0')
            {
                sum++;
                if(sum>maxsum)
                {
                    maxsum=sum;
                    arr[0]=start+1;
                    arr[1]=i+1;
                }
                end++;
            }
            else
            {   sum--;
                if(sum<0)
                {
                    sum=0;
                    start=i+1;
                    end=i+1;
                }
                else
                end++;
            }
        }
        return arr;
    }
}
