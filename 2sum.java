public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] twoSum(final int[] A, int B) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]=new int[2];
        for(int i=0;i<A.length;i++)
        {
            if(map.containsKey(B-A[i]))
            {
                arr[0]=map.get(B-A[i])+1;
                arr[1]=i+1;
                break;
            }
            else if(!map.containsKey(A[i]))
            {
                map.put(A[i],i);
            }
        }
        if(arr[0]!=0&&arr[1]!=0)
        return arr;
        else
        return new int[0];
    }
}
