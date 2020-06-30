public class Solution {
    public String solve(String A) {
        if(A.length()<=1)
        return A;
        Queue<Character> ch=new LinkedList<Character>();
        HashMap<Character,Integer> map=new HashMap<>();
        StringBuilder out=new StringBuilder();
        for(int i=0;i<A.length();i++)
        {   char c=A.charAt(i);
            
            if(!map.containsKey(c))
            {
                map.put(c,1);
                ch.add(c);
            }
            else
            {
                map.put(c,2);
            }
            while(!ch.isEmpty()&&map.get(ch.peek())==2)
            ch.poll();
            if(ch.isEmpty())
            out.append("#");
            else
            out.append(ch.peek());
        }
        return out.toString();
    }
}
