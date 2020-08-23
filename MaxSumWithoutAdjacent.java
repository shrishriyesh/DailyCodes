public class Solution {
    public int adjacent(ArrayList<ArrayList<Integer>> A) {
        int incl = Math.max(A.get(0).get(0),A.get(1).get(0));
        int excl = 0;
        int temp;
        for(int i=1; i<A.get(0).size(); i++) {
            temp = incl;
            incl = Math.max(incl, excl + Math.max(A.get(0).get(i),A.get(1).get(i)));
            excl = temp;
        }
        return incl;
    }
}
