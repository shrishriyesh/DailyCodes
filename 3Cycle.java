public class solution {
    public int solve(int n,int m,int U[],int V[]) {
        int graph[][]=new int[n+1][n+1];
        for(int i=0;i<m;i++)
        {
			graph[U[i]][V[i]]=1;
            graph[V[i]][U[i]]=1;
        }
        int c=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(graph[i][j]==1)
                {
                    for(int k=1;k<=n;k++)
                        
                        if(graph[j][k]==1)
                        {
                           if(k==i)
                            continue;
                            if(graph[k][i]==1)
                                c++;
                                
                        }
                }
            }
        }
        return (c/6);
    }
}
