


/*Complete the function below*/

/*
ArrayList<ArrayList<Integer>> adj: to represent graph containing 'v'
                                    vertices and edges between them
V: represent number of vertices
*/
class DetectCycle
{
    static boolean isCyclic(ArrayList<ArrayList<Integer>> adj, int V)
    {
        boolean vis[]=new boolean[V];
        for(int i=0;i<V;i++)
        {
            vis[i]=true;
            for(int j=0;j<adj.get(i).size();j++)
            {
                if(helper(adj,vis,adj.get(i).get(j)))
                return true;
            }
            vis[i]=false;
        }
        return false;
    }
    static boolean helper(ArrayList<ArrayList<Integer>> adj,boolean vis[],int node)
    {
        if(vis[node]==true)
        return true;
        vis[node]=true;
        for(int i=0;i<adj.get(node).size();i++)
        {
            if(helper(adj,vis,adj.get(node).get(i)))
            return true;
        }
        vis[node]=false;
        return false;
    }
}
