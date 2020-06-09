public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) 
	{
	    HashMap<Integer,Integer> m=new HashMap<>();
	    int n=a.size()/3;
	    for(int i=0;i<a.size();i++)
	    {
	        if(!m.containsKey(a.get(i)))
	        {
	        m.put(a.get(i),1);
	        if(m.get(a.get(i))>n)
	            return a.get(i);
	        }
	        else
	        {
	            m.put(a.get(i),m.get(a.get(i))+1);
	            if(m.get(a.get(i))>n)
	            return a.get(i);
	        }
	    }
	    
	    return -1;
	}
}
