public class Solution {
    public int firstMissingPositive(int[] A) 
    {
        int c=0;
        //int Arr[]=new int[A.length];
        int max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>0)
            {
            map.put(A[i],i);
            }
            if(A[i]>max)
            max=A[i];
        }
        for(int i=1;i<A.length;i++)
        {
            if(!map.containsKey(i))
            {
                return i;
            }
        }
        if((A.length==1)&&(A[0]==1))
        return 2;
        else if((A[0]==1)&&(A.length>1))
        return max+1;
        else
        return 1;
    }
}
