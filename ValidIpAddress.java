public class Solution {
    public ArrayList<String> restoreIpAddresses(String A) 
    {   ArrayList<String> out=new ArrayList<>();
        A.trim();
        for(int i=1;i<A.length()-2;i++)
        {
            for(int j=i+1;j<A.length()-1;j++)
            {
                for(int k=j+1;k<A.length();k++)
                {
                    String st=A.substring(0,i)+'.'+A.substring(i,j)+'.'+A.substring(j,k)+'.'+A.substring(k);
                    if(check(st)==1)
                    out.add(st);
                    else
                    continue;
                }
            }
        }
        return out;
        
    }
    public int check(String str)
    {
        StringTokenizer st=new StringTokenizer(str,".");
        while(st.hasMoreTokens())
        {   String x=st.nextToken();
        if(x.length()==0)
        return 0;
        if(x.length()>3)
        return 0;
        if(x.equals("00")||x.equals("000"))
        return 0;
            int num=Integer.parseInt(x);
            if(num<=255)
            {   if(Integer.toString(num).equals(x))
                continue;
                else
                return 0;
            }
            else
            return 0;
        }
        return 1;
    }
}
