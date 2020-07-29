public class Solution {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        //PriorityQueue<Integer> q=new PriorityQueue<>();
        ArrayList<Integer> out=new ArrayList<>();
        for(int i=0;i<A.size();i++)
        {
            for(int j=0;j<A.get(i).size();j++)
            {
                out.add(A.get(i).get(j));
            }
        }
        Collections.sort(out);
        return out;
    }
}
