public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int lengthOfLastWord(final String A) 
    {   int c=0;int flag=0;
        if((A.trim()).equals(""))
        return 0;
        String Ar=A.trim();
        for(int i=Ar.length()-1;i>=0;i--)
        {   
            if(Ar.charAt(i)==' ')
            {   
                flag=1;
                break;
            }
            c++;
        }
        return c;
    }
//     public int lengthOfLastWord(final String A) {

//     if((A.trim()).equals(""))
//         return 0;
    
//     return A.split(" ")[A.split(" ").length-1].length();
    
    
// }
}
