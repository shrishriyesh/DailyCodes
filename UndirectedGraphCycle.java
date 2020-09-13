
class DetectCycle
{
    static boolean isCyclic(ArrayList<ArrayList<Integer>> g, int V)
    {
       boolean vis[]=new boolean[V];
       for(int i=0;i<V;i++)
       {
           if(!vis[i])
            if(helper(g,vis,0,-1))
            return true;
        }
        return false;
    }
    static boolean helper(ArrayList<ArrayList<Integer>> g,boolean vis[],int node,int parent)
    {      vis[node]=true;
            //out.add(node);
            for(int i=0;i<g.get(node).size();i++)
            {   if(!vis[g.get(node).get(i)])
                {if(helper(g,vis,g.get(node).get(i),node))
                return true;
                }
                else if(parent!=g.get(node).get(i))
                return true;
            }
        return false;
    }
}
