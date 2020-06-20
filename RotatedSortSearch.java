public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int search(final List<Integer> A, int B) {
       
        int l=0;
        int h=A.size()-1;
        while(l<=h)
        {   
            int mid=(l+h)/2;
            if(A.get(mid)==B)
            return mid;
            else if(A.get(mid)>A.get(l))
            {
                if(B>=A.get(l)&&B<A.get(mid))
                h=mid-1;
                else
                l=mid+1;
            }
            else
            {
                if(A.get(mid)<B&&A.get(h)>=B)
                l=mid+1;
                else
                h=mid-1;
            }
        }
        return -1;
    
        
	}
    
}
