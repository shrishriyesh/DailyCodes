public class Solution {
    public int braces(String A) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<A.length();i++)
        {char c=A.charAt(i);
            if(st.isEmpty()&&c==')')
            return 1;
            if(c=='(')
            st.push(c);
            else if(c=='+'||c=='-'||c=='*'||c=='/')
            st.push(c);
            else if(!st.isEmpty()&&c==')')
            {   int f=0;
                while(!st.isEmpty()&&st.peek()!='(')
                {   char ch=st.pop();
                    if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
                    {
                        f=1;
                    }
                }
                if(f==0||st.isEmpty()||st.peek()!='(')
                return 1;
                char ch=st.pop();
            }
            else
            continue;
        }
        return 0;
    }
}
