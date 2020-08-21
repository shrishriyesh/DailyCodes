public class Solution {
    public ArrayList<ArrayList<String>> partition(String a) {
        ArrayList<ArrayList<String>> out=new ArrayList<>();
        helper(a,out,new ArrayList<>());
        return out;
    }
    public void helper(String st,ArrayList<ArrayList<String>> out,ArrayList<String> res)
    {
        if(st.length()==0)
        out.add(new ArrayList<>(res));
        for(int i=0;i<st.length();i++)
        {
            String left=st.substring(0,i+1);
            if(ispallin(left))
            {
                res.add(left);
                helper(st.substring(i+1),out,res);
                res.remove(res.size()-1);
            }
        }
    }
    public boolean ispallin(String x)
    {
        if(x.length()==1||x.length()==0)
        return true;
        int i=0;int j=x.length()-1;
        while(i<j)
        {
            if(x.charAt(i)!=x.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
}
