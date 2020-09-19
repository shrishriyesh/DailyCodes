public class Solution {
    int dx[]={1,-1,0,0};
    int dy[]={0,0,1,-1};
	public void solve(ArrayList<ArrayList<Character>> a) {
	    int m=a.size();
	    int n=a.get(0).size();
	    boolean vis[][]=new boolean[m][n];
	    for(int i=0;i<n;i++)
	    {
	        if(a.get(0).get(i)=='O'&&vis[0][i]==false)
	        DFS(a,0,i,vis);
	        if(a.get(m-1).get(i)=='O'&&vis[m-1][i]==false)
	        DFS(a,m-1,i,vis);
	    }
	    for(int i=0;i<m;i++)
	    {
	        if(a.get(i).get(0)=='O'&&vis[i][0]==false)
	        DFS(a,i,0,vis);
	        if(a.get(i).get(n-1)=='O'&&vis[i][n-1]==false)
	        DFS(a,i,n-1,vis);
	    }
	    for(int i=1;i<m;i++)
	    {
	        for(int j=1;j<n;j++)
	        {
	            if(a.get(i).get(j)=='O'&&vis[i][j]==false)
	            DFS1(a,i,j,vis);
	        }
	    }
	}
	public void DFS(ArrayList<ArrayList<Character>> a,int x,int y,boolean vis[][])
	{   int m=a.size();
	    int n=a.get(0).size();
	    if(vis[x][y]==true)
	    return;
	    vis[x][y]=true;
	    for(int i=0;i<4;i++)
	    {
	        int x1=x+dx[i];
	        int y1=y+dy[i];
	        if(x1>=0&&y1>=0&&x1<m&&y1<n&&a.get(x1).get(y1)=='O'&&vis[x1][y1]==false)
	        DFS(a,x1,y1,vis);
	    }
	    return;
	}
	public void DFS1(ArrayList<ArrayList<Character>> a,int x,int y,boolean vis[][])
	{   int m=a.size();
	    int n=a.get(0).size();
	    if(vis[x][y]==true)
	    return;
	    vis[x][y]=true;
	    a.get(x).set(y,'X');
	    for(int i=0;i<4;i++)
	    {
	        int x1=x+dx[i];
	        int y1=y+dy[i];
	        if(x1>=0&&y1>=0&&x1<m&&y1<n&&a.get(x1).get(y1)=='O'&&vis[x1][y1]==false)
	        DFS1(a,x1,y1,vis);
	    }
	    return;
	}
}
