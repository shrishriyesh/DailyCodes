public class solution {
    int max=0;
    int trav[][]={{-1,0},{1,0},{0,-1},{0,1}};
    int visit[][];
    int count=0;
    public int solve(int n,String cake[]) {
        visit=new int[n][n];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {int c=0;
            if(visit[i][j]==0&&cake[i].charAt(j)=='1')
               c= DFS(cake,i,j,n);
             if(c>max)
                 max=c;
        }
            
    }
        return max;
        
}
    public int DFS(String cake[],int x,int y,int n)
    {
         if(x<0||y<0||x>=n||y>=n)
        return 0;
        if(visit[x][y]==1)
            return 0;
            count=1;
        visit[x][y]=1;
        for(int i=0;i<4;i++)
        {
            int nx=x+trav[i][0];
            int ny=y+trav[i][1];
            if(nx>=0&&ny>=0&&nx<n&&ny<n)
            {if(cake[nx].charAt(ny)=='1')
                count= count+DFS(cake,nx,ny,n);
        }
        }
        return count;
    }
}
