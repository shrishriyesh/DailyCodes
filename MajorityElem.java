public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int majorityElement(final List<Integer> A) {
        int n=A.size();
        //n=Math.floor(n/2);
        int returnValue=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<A.size();i++)
        {
            map.put(A.get(i),map.getOrDefault(A.get(i),0)+1);
            if (map.get(A.get(i)) > A.size() / 2) {
            returnValue = A.get(i);
        }
        }
        
   
    
    
  return returnValue;
    }
}
