public class Solution {
    public int black(ArrayList<String> A) {
        boolean vis[][]=new boolean[A.size()][A.get(0).length()];
        int c=0;
        for(int i=0;i<A.size();i++)
        {
            for(int j=0;j<A.get(0).length();j++)
            {
                if(!vis[i][j]&&A.get(i).charAt(j)=='X')
                {
                    DFS(i,j,A,vis);
                    c++;
                }
            }
        }
        return c;
    }
    public void DFS(int i,int j,ArrayList<String> A,boolean vis[][])
    {
        if(i>=A.size()||j<0||i<0||j>=A.get(0).length()||vis[i][j]||A.get(i).charAt(j)!='X')
        return;
        vis[i][j]=true;
        DFS(i+1,j,A,vis);
        DFS(i-1,j,A,vis);
        DFS(i,j+1,A,vis);
        DFS(i,j-1,A,vis);
        return;
    }
}
