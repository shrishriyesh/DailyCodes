public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int trap(final List<Integer> A) {
        int left[]=new int[A.size()];
        int right[]=new int[A.size()];
        left[0]=A.get(0);
        int i=1;
        int n=A.size()-1;
        right[n]=A.get(n);
        n--;
        while(i<A.size()-1||n>=0)
        {
            if(A.get(i)>left[i-1])
            left[i]=A.get(i);
            else
            left[i]=left[i-1];
            i++;
            if(A.get(n)>right[n+1])
            right[n]=A.get(n);
            else
            right[n]=right[n+1];
            n--;
        }
        int sum=0;
        for(int k=0;k<A.size();k++)
        {
            sum+=Math.min(left[k],right[k])-A.get(k);
        }
        return sum;
    }
}
