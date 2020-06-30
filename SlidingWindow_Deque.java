public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
       ArrayList<Integer> out=new ArrayList<>();
        if(A.size()<=B)
        {   int max=Integer.MIN_VALUE;
            for(int i=0;i<A.size();i++)
            {
                if(A.get(i)>max)
                max=A.get(i);
            }
            out.add(max);
            return out;
        }
        Deque<Integer> max= new LinkedList<Integer>();
        int i=0;
        for(i=0;i<B;i++)
        {
            while((!max.isEmpty())&&(A.get(i)>=A.get(max.peekLast())))
            max.removeLast();
        max.addLast(i);
        }
        for(;i<A.size();i++)
        {
            out.add(A.get(max.peek()));
            while(!max.isEmpty()&&max.peek()<=i-B)
            max.removeFirst();
            while(!max.isEmpty()&&A.get(i)>=A.get(max.peekLast()))
            max.removeLast();
        max.addLast(i);
        }
        out.add(A.get(max.peek()));
        return out;
    }
}
