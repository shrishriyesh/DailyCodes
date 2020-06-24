public class Solution {
    public String longestPalindrome(String A) {
        String maxout=""+A.charAt(0);
        if(A.length()==1)
        return A;
        for(int i=1;i<A.length()-1;i++)
        {
            int j=i-1; int k=i+1;String out="";
            while(j>=0&&k<A.length())
            {
                if(A.charAt(j)==A.charAt(k))
                {
                    out=A.substring(j,k+1);
                    j--;
                    k++;
                }
                else
                break;
            }
            if(out.length()>maxout.length())
            maxout=out;
        }
        for(int i=1;i<A.length();i++)
        {
            int j=i-1; int k=i;String out="";
            while(j>=0&&k<A.length())
            {
                if(A.charAt(j)==A.charAt(k))
                {
                    out=A.substring(j,k+1);
                    j--;
                    k++;
                }
                else
                break;
            }
            if(out.length()>maxout.length())
            maxout=out;
        }
        return maxout;
    }
}
