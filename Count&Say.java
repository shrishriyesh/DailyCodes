public class Solution {
    public String countAndSay(int A) 
    {
        String st="1";
        for(int i=1;i<A;i++)
        {
            int count=0;
            String x="";
            char temp='z';
            for(int j=0;j<st.length();j++)
            {
                if(count==0)
                {
                    temp=st.charAt(j);
                    count++;
                }
                else if((count>0)&&(temp==st.charAt(j)))
                {
                    count++;
                }
                if(j==st.length()-1||temp!=st.charAt(j+1))
                {
                    x=x+Integer.toString(count)+st.charAt(j);
                    count=0;
                }
            }
            st=x;
        }
        return st;
    }
}
