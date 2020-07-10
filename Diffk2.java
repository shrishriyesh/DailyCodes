public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int diffPossible(final int[] A, int B) {
        if(A.length==1)
        return 0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<A.length;i++)
        map.put(A[i],i);
        for(int i=0;i<A.length;i++)
        {
            if(map.containsKey(A[i]+B)&&map.get(A[i]+B)!=i)
            return 1;
        }
        return 0;
         
    }
}
