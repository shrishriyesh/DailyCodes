public class Solution {
    public int evalRPN(ArrayList<String> A) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<A.size();i++)
        {   String ch=A.get(i);
            char c=ch.charAt(0);
            if(ch.equals("+")||ch.equals("-")||ch.equals("/")||ch.equals("*"))
            {
                int a=s.pop();
                int b=s.pop();
                if(c=='+')
                s.push(b+a);
                if(c=='*')
                s.push(b*a);
                if(c=='-')
                s.push(b-a);
                if(c=='/')
                s.push(b/a);
            }
            else
            s.push(Integer.parseInt(ch));
        }
        return s.peek();
    }
}
