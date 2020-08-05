public class Solution {
	public int minimumTotal(ArrayList<ArrayList<Integer>> A) {
	if(A.size()==0)
    return 0;

int n=A.size();
if(n==1)
return A.get(0).get(0);

for(int i=n-1;i>0;--i)
{
    int l=i-1;
    for(int j=A.get(l).size()-1;j>=0;--j)
    {
        A.get(i-1).set(j,(A.get(i-1).get(j)+(int)Math.min(A.get(i).get(j),A.get(i).get(j+1)))); // we just add up the min of two values to the one above it
    }
}

return A.get(0).get(0);
	    
	}
}
