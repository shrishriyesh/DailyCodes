public class Solution {
    public ArrayList<Integer> equal(ArrayList<Integer> A) 
    {
        ArrayList<Integer> out=new ArrayList<>();
        HashMap<Integer,int[]> map=new HashMap<>();
        for(int i=0;i<A.size()-1;i++)
        {
            for(int j=i+1;j<A.size();j++)
            {
                int sum=A.get(i)+A.get(j);
                int arr[]=new int[]{i,j};
                if(!map.containsKey(sum))
                {map.put(sum,arr);continue;}
                else
                {
                    int X[]=map.get(sum);
                    if(X[0]==i||X[1]==j||X[1]==i)
                    continue;
                    else
                    {   int comp[]=new int[]{X[0],X[1],i,j};
                        if(out.isEmpty())
                        {out.add(X[0]);
                        out.add(X[1]);
                        out.add(i);
                        out.add(j);
                        }
                        else
                        {
                            if(comp[0] <out.get(0)||(comp[0]==out.get(0)&&comp[1]<out.get(1))||(comp[0]==out.get(0)&&comp[1]==out.get(1)&&comp[2]<out.get(2))||(comp[0]==out.get(0)&&comp[1]==out.get(1)&&comp[2]==out.get(2)&&comp[3]<out.get(3)))
                            {
                                out.set(0,comp[0]);
                                out.set(1,comp[1]);
                                out.set(2,comp[2]);
                                out.set(3,comp[3]);
                            }
                        }
                    }
                }
            }
        }
        return out;
    }
}
