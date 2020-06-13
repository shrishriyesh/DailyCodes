public class Solution {
    public String longestCommonPrefix(String[] A) {
        int len=A[0].length();
        if(A.length==1)
        return A[0];
        //Getting the minimum length of string in array
        for(int i=0;i<A.length;i++)
        {
            if(len>A[i].length())
            len=A[i].length();
        }
        int c=0;
        ////checking each character of first string till min length in the entire array
        for(int j=0;j<len;j++)
        {int flag=0;
        for(int i=0;i<A.length;i++)
        {
         if(A[0].charAt(j)==A[i].charAt(j))
         flag=1;
         else
         {flag=0;
             break;
            
         }}
        if(flag==1)
        c++;
        else
        break;
        }
        return A[0].substring(0,c);
    }
}
