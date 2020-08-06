public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProfit(final List<Integer> A) {
        if(A.size()==0||A.size()==1)
        return 0;
        int left[]=new int[A.size()];
        int right[]=new int[A.size()];
        int n=right.length-2;
        int lmin=A.get(0);
        int rmin=A.get(A.size()-1);
        for(int i=1;i<left.length;i++)
        {   
            left[i]=Math.max(left[i-1],A.get(i)-lmin);
            lmin=Math.min(lmin,A.get(i));
            if(n>=0)
            {right[n]=Math.max(right[n+1],rmin-A.get(n));
            rmin=Math.max(rmin,A.get(n));
            n--;}
        }
        
        int sum=0;
        for(int i=0;i<A.size();i++)
        {//System.out.println(right[i]+" "+left[i]);
            sum=Math.max(sum,left[i]+right[i]);
        }
        return sum;
    }
}
