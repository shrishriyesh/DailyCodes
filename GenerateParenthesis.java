public class Solution {
    public ArrayList<String> generateParenthesis(int A) 
    {
        ArrayList<String> res=new ArrayList<>();
        //char ch[]=new char[2*A];
        Helper(res,A,0,0,"");
        Collections.sort(res);
        return res;
    }
    public void Helper(ArrayList<String> res,int A,int opb,int clb,String out )
    {
        if(opb==A&&clb==A)
        {res.add(out);
        return;}
        if(opb>clb)
        Helper(res,A,opb,clb+1,(out+")"));
        if(opb<A)
        Helper(res,A,opb+1,clb,(out+"("));
    }
}
