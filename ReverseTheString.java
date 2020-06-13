public class Solution {
    public String solve(String A) {
        if(A.length()==1)
        return A;
        StringTokenizer st=new StringTokenizer(A);
        String out="";
        ArrayList<String> arr=new ArrayList<>();
        while(st.hasMoreTokens())
        {
            arr.add(st.nextToken().trim());
        }
        for(int i=arr.size()-1;i>=0;i--)
        {
            out=out+" "+(arr.get(i).trim());
        }
        return out.trim();
    }
}
