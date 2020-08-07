public class Solution {
    public int mice(ArrayList<Integer> A, ArrayList<Integer> B) {
        Collections.sort(A);
        Collections.sort(B);
        int sub=0;
        for(int i=0;i<A.size();i++)
        {
            sub=Math.max(sub,(int)Math.abs(A.get(i)-B.get(i)));        
        }
        return sub;
    }
}
