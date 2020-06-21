public class Solution {
    public ArrayList<String> prettyJSON(String A) 
    {   String out="";
        A.trim();int t=0;int f=0;
        ArrayList<String> arr= new ArrayList<>();
        for(int i=0;i<A.length();i++)
        {
            
            char c=A.charAt(i);
            if(c=='{'||c=='[')
            {   if(out.length()>0)
                {   arr.add(out);
                    out="";
                }
                int temp=0;
                while(temp<t)
                {
                    temp++;
                    out=out+"\t";
                }
                out=out+c;
                arr.add(out);
                out="";
                t++;
                continue;
                
            }
            else if(c=='}'||c==']')
            {if(out.length()>0)
                {   arr.add(out);
                    out="";
                }
                int temp=0;
                t--;
                while(temp<t)
                {
                    temp++;
                    out=out+"\t";
                }
                out=out+c;
                continue;
            }
            else
            {int temp=0;
               
             if(c==',')
             {
                 out=out+c;
                 arr.add(out);
                 out="";
                 continue;
             }
             else
             { 
                 if(out.length()==0)
                 {  
                     while(temp<t)
                {
                    temp++;
                    out=out+"\t";
                }
                
                 }
                 out=out+c;
                 continue;
             }
            }
        }
        if(out.length()>0)
        arr.add(out);
        return arr;
    }
}
