public class Solution {
  
    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(A.size() < 3)
            return res;
        Collections.sort(A);
        int i = 0;
        while(i < A.size()){
            int j = i+1, k = A.size() - 1;
            while(j < k){
                long sum = (long)A.get(i) + (long)A.get(j) + (long)A.get(k);
                if(sum == 0){
                    ArrayList<Integer> a = new ArrayList<Integer>();
                    a.add(A.get(i));
                    a.add(A.get(j));
                    a.add(A.get(k));
                    if(!res.contains(a))
                        res.add(a);
                }
                if(sum > 0)
                    k--;
                else
                    j++;
            }
            i++;
        }
        return res;
    }
      
}
