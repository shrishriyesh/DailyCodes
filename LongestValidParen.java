public class Solution {
    public int longestValidParentheses(String A) {
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        int max=0;
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)==')')
            {
                st.pop();
                if(st.isEmpty())
                st.push(i);
                else
                max=Math.max(i-st.peek(),max);
            }
            else
            {
                st.push(i);
            }
        }
        return max;
    }
}
