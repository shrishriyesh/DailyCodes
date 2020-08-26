public class Solution {
    public int solve(String A) 
    {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)=='(')
            {
                st.push('(');
            }
            else if(!st.isEmpty())
            st.pop();
            else
            return 0;
        }
        if(st.isEmpty())
        return 1;
        else
        return 0;
    }
}
