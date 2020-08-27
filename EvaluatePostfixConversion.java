import java.io.*;
import java.util.*;
public class Solution {

	public static void evaluatePostfix(String input){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print output and don't return it.
	 	 * Taking input is handled automatically.
		 */
        Stack<Character> st=new Stack<>();
        String str="";
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('(',5);
        map.put(')',5);
        map.put('^',2);
        map.put('*',3);
        map.put('/',3);
        map.put('+',4);
        map.put('-',4);
    	for(int i=0;i<input.length();i++)
        {	char c=input.charAt(i);
            if(Character.isDigit(c))
            {
                str+=" "+c;
            }
         	else
            {
                if(c=='(')
                    st.push(c);
                else if(c==')')
                {
                    while(st.peek()!='(')
                        str+=" "+st.pop();
                }
                else
                {
                    if(st.isEmpty())
                        st.push(c);
                    else
                    {
                        while(!st.isEmpty()&&map.get(c)>=map.get(st.peek()))
                        {
                           str+=" "+st.pop();
                        }
                        st.push(c);
                    }
                }
            }
        }
		while(!st.isEmpty())
        { char c=st.pop();
           	if(c!='(')
            str+=" "+c;
        }
        Stack<Integer> num=new Stack<>();
        for(int i=0;i<str.length();i++)
        {char c=str.charAt(i);
            if(Character.isDigit(c))
                num.push(Integer.parseInt(String.valueOf(c)));
         	else if(c==' ')
                continue;
         else
         {
             int num2=num.pop();
             int num1=num.pop();
             if(c=='+')
                 num.push(num1+num2);
             if(c=='-')
                 num.push(num1-num2);
             if(c=='*')
                 num.push(num1*num2);
             if(c=='/')
                 num.push(num1/num2);
             if(c=='^')
                 num.push(num1^num2);
         }
         System.out.print(str.charAt(i));
        }
        System.out.println("");
        System.out.println(num.peek());
	}
}
