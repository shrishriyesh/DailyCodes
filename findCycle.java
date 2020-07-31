
public class solution {
    int visited[][];
    int trav[][]={{0,1},{0,-1},{1,0},{-1,0}};
    int find=0;
	int solve(String[] board , int n, int m)
	{
		// Write your code here.
		visited=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(visited[i][j]==0)
                    DFS(board,i,j,-1,-1,board[i].charAt(j),n,m);
            }
        }
        return find;
	}
    public void DFS(String board[],int x,int y,int px,int py,char col,int n,int m)
    {
        if(x<0||y<0||x>=n||y>=m)
            return;
        if(board[x].charAt(y)!=col)
            return;
        if(visited[x][y]==1)
        {    find=1;
        return;}
        visited[x][y]=1;
        for(int i=0;i<4;i++)
        {
            int nx=x+trav[i][0];
            int ny=y+trav[i][1];
            if(nx==px&&ny==py)
                continue;
            
           // if(board[x].charAt(y)==col)
            DFS(board,nx,ny,x,y,col,n,m);
        }
        return;
    }
}
