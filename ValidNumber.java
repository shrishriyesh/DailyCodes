public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int isNumber(final String A)
    {   String st=A.trim();int pmflag=0;int dotflag=0;int eflag=0;
        if(st.length()==0)
        return 0;
        for(int i=0;i<st.length();i++)
        {   if(Character.isDigit(st.charAt(i))==false)
        {   
            if(((st.charAt(i)=='e')&&eflag==0)&&(i!=0||i!=st.length()-1))
            {
                eflag=1;
                continue;
            }
            else if(((st.charAt(i)=='+')||(st.charAt(i)=='-'))&&((i==0)||(st.charAt(i-1)=='e'))&&(i!=st.length()-1))
            {continue;}
            else if((st.charAt(i)=='.')&&((dotflag==0)&&(i!=st.length()-1))&&(eflag==0))
            {if(st.charAt(i+1)=='e')
                return 0;
                dotflag=1;
                continue;
            }
            else
            return 0;
        }
        else
        continue;
        }
        return 1;
    }
}
