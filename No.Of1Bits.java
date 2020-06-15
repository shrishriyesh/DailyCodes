public class Solution {
	public int numSetBits(long a) {
	    int c=0;
	    while(a>0)
	    {
	        a=a&(a-1);
	        c++;
	    }
	    return c;
	}
}
