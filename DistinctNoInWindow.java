public class Solution {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        ArrayList<Integer> out=new ArrayList<>();
        if(B>A.size())
        return out;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;int c=0;
        for(i=0;i<B;i++)
        {
            if(!map.containsKey(A.get(i)))
            {
                c++;
                map.put(A.get(i),1);
            }
            else
            {
                map.put(A.get(i),map.get(A.get(i))+1);
            }
        }
        out.add(c);
        if(B==A.size())
        return out;
        while(i<A.size())
        {
            int prev=A.get(i-B);
            int curr=A.get(i);
            map.put(prev,map.get(prev)-1);
            if(map.get(prev)==0)
            c--;
            if((!map.containsKey(curr))||map.get(curr)==0)
            {
                map.put(curr,1);
                c++;
            }
            else
            map.put(curr,map.get(curr)+1);
            i++;
            out.add(c);
        }
        return out;
    }
}
