public class Solution {
    public String simplifyPath(String A) {
        Stack<String> n=new Stack<>();
       // StringTokenizer st= new StringTokenizer(A,"/");
       //int j=0;
       String st[]=A.split("/");
        for(int j=0;j<st.length;j++)
        {   //System.out.print(st[j]);
            String s=st[j];
            if(s.equals(".")||s.trim()==""||s.isEmpty())//(s.length()>1&&s.charAt(s.length()-1)=='/'))
            continue;
            else if(s.equals(".."))
            {
                if(!n.isEmpty())
                n.pop();
                continue;
            }
            else
            n.push(s);
        }
        StringBuilder out=new StringBuilder();int i=0;
        while(i<n.size())
        {
           out.append("/");
           out.append(n.get(i));
            i++;
        }
        if(out.length()!=0)
        return out.toString();
        else
        return "/";
    }
}    
