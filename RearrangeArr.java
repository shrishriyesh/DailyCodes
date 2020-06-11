public class Solution {
	public void arrange(ArrayList<Integer> a) 
	{
	   // ArrayList<Integer> arr=new ArrayList<>();
	   // for(int i=0;i<a.size();i++)
	   // {
	   //     arr.add(a.get(a.get(i)));
	   // }
	   // for(int i=0;i<a.size();i++)
	   // {
	   //     a.set(i,arr.get(i));
	   // }
	   int n=a.size();
	   for(int i=0;i<a.size();i++)
	   {
	       a.set(i, a.get(i) + (a.get(a.get(i)) % n) * n );
	   }
	   for(int i=0;i<a.size();i++)
	   {
	       a.set(i,a.get(i)/n);
	   }
	}
}
