public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) 
    {int i=0;int j=0;
    int k=0;
    ArrayList<Integer> out=new ArrayList<>();
        while(i<A.size()&&j<B.size())
        {
            if(A.get(i).equals(B.get(j)))
            {
                out.add(A.get(i));
                i++;j++;
            }
            else if((A.get(i)>B.get(j)))
            j++;
            else
            i++;
            //if((i<A.size()&&j<B.size())&&(B.get(j)>=A.get(i)))
            //i++;
        }
        return out;
    }
}
