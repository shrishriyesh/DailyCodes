public class Solution {
 public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        ArrayList<ArrayList<Integer>> out=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        Collections.sort(A);
        generate(A,B,A.size(),out,res,0);
        return out;
    }
    public void generate(ArrayList<Integer> A,int sum,int n,ArrayList<ArrayList<Integer>> out,ArrayList<Integer> res,int in)
    {
     for(int i=in;i<n;i++)
     {
         res.add(A.get(i));
         if(check(sum,res,out))
         out.add(new ArrayList<>(res));
         generate(A,sum,n,out,res,i+1);
         res.remove(res.size()-1);
     }
    }
    public boolean check(int sum,ArrayList<Integer> res,ArrayList<ArrayList<Integer>> out)
    {
        for(int i=0;i<res.size();i++)
        {
            sum-=res.get(i);
        }
        boolean flag=false;
        if(out.size()!=0&&out.get(out.size()-1).size()==res.size())
        {
        
            for(int i=0;i<out.get(out.size()-1).size();i++)
            {
                if(out.get(out.size()-1).get(i)!=res.get(i))
                flag=true;
            }
        }
        else
        flag=true;
        return sum==0&&flag;
    }


}
