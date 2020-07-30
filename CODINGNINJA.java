import java.io.*;
import java.util.*;
public class solution {
    int used[][]; 
	String pat="CODINGNINJA";
    int trav[][]={{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
	int solve(String Graph[], int N, int M)
	{
		used=new int[N][M];
        int flag=0;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<Graph[i].length();j++)
            {
                if(Graph[i].charAt(j)=='C')
                {
                    flag=help(Graph,i,j,1,N,M);
                    if(flag==1)
                        return flag;
                }
            }
           
        }
	return flag;
	}
    public int help(String graph[],int x,int y,int in,int M,int N)
    {
        if(in>=pat.length())
            return 1;
        int flag=0;
        used[x][y]=1;
    	for(int i=0;i<trav.length;i++)
        {
            int nx=x+trav[i][0];
            int ny=y+trav[i][1];
            if(nx>=0&&ny>=0&&nx<M&&ny<N)
            {
                if(graph[nx].charAt(ny)==pat.charAt(in)&&used[nx][ny]==0)
                    flag=flag |help(graph,nx,ny,in+1,M,N);
            }
        }
        used[x][y]=0;
        return flag;
    }
    
}
