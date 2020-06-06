 public class Solution {
// 	public void setZeroes(ArrayList<ArrayList<Integer>> a) 
// 	{   ArrayList<Integer> r=new ArrayList<>();
// 	ArrayList<Integer> c=new ArrayList<>();
// 	    for(int i=0;i<a.size();i++)
// 	    {
// 	        for(int j=0;j<a.get(i).size();j++)
// 	        {
// 	            if(a.get(i).get(j)==0)
// 	            {
// 	                r.add(i);
// 	                c.add(j);
// 	            }
// 	        }
// 	    }
// 	    for(int i=0;i<r.size();i++)
// 	    {
// 	        remr(a,r.get(i));
// 	    }
// 	    for(int i=0;i<c.size();i++)
// 	    {
// 	        remc(a,c.get(i));
// 	    }
// 	}
// 	public void remr(ArrayList<ArrayList<Integer>> a,int r)
// 	{
// 	    for(int i=0;i<a.get(0).size();i++)
// 	    {
// 	        a.get(r).set(i,0);
// 	    }
// 	}
// 	public void remc(ArrayList<ArrayList<Integer>> a,int c)
// 	{
// 	    for(int i=0;i<a.size();i++)
// 	    {
// 	        a.get(i).set(c,0);
// 	    }
// 	}
// }
public static void setRowZero(ArrayList<ArrayList<Integer>> a, int row){
    int m=a.size();
       int n=a.get(0).size();
       boolean row[] = new boolean[a.size()];
       boolean col[] = new boolean[a.get(0).size()];
      for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
              if(a.get(i).get(j)==0){
                  row[i]=true;
                  col[j]=true;
              }
          }
      }
      for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
            if(row[i]||col[j]) a.get(i).set(j,0);
        }
      }

}
}
