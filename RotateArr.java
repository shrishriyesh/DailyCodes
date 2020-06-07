public class Solution {
    public void rotate(ArrayList<ArrayList<Integer>> a) {
        int n = a.size();
        for(int level=0;level<n/2;level++) {
            for(int y=level; y< n-level-1;y++) {
                int temp = a.get(level).get(y);
                a.get(level).set(y, a.get(n-1-y).get(level));
                a.get(n-1-y).set(level, a.get(n-1-level).get(n-1-y));
                a.get(n-1-level).set(n-1-y, a.get(y).get(n-1-level));
                a.get(y).set(n-1-level, temp);
            }
        }
    }
}
