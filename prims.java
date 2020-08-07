import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();
		int parent[]=new int[V];
        boolean visit[]=new boolean[V];
		/* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
        int graph[][]=new int[V][V];
    	for(int i=0;i<E;i++)
        {
            int u=s.nextInt();
            int v=s.nextInt();
            int weight=s.nextInt();
            graph[u][v]=weight;
            graph[v][u]=weight;
            
        }
        prims(graph,parent,visit);
	}
    public static void prims(int graph[][],int par[],boolean vis[])
    {	int v=graph.length;
        par[0]=-1;
        int w[]=new int[graph.length];
        w[0]=0;
        for(int i=1;i<w.length;i++)
            w[i]=Integer.MAX_VALUE;
        for(int i=0;i<v;i++)
        {
            int min=-1;
            for(int j=0;j<v;j++)
            {
                if(!vis[j]&&(min==-1||w[j]<w[min]))
                    min=j;
            }
            vis[min]=true;
            for(int j=0;j<v;j++)
            {
                if(graph[min][j]!=0&&vis[j]==false)
                {
                    if(graph[min][j]<w[j])
                    {
                        w[j]=graph[min][j];
                        par[j]=min;
                    }
                }
            }
        }
     for(int i=1;i<v;i++)
     {
         if(par[i]>i)
             System.out.println(i+" "+par[i]+" "+w[i]);
         else
             System.out.println(par[i]+" "+i+" "+w[i]);
     }
    }
}
