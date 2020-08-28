// public class Solution {
//     public void solve(ArrayList<ArrayList<Character>> a) 
//     {
//         for(int i=0;i<a.size();i++)
//         {
//             for(int j=0;j<a.get(i).size();j++)
//             {
//                 dfs(a,i,j,)
//             }
//         }
//     }
// }

public class Solution {
    boolean isValid(int i,int j, boolean[][] visit,ArrayList<ArrayList<Character>> arr,int row,int col){
        if(i>=0 && i<row && j>=0 && j<col && arr.get(i).get(j)=='O' && !visit[i][j]) return true;
        return false;
    }
    class Pair{
        int x,y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    int []shiftX = new int[]{-1,0,0,1};
    int []shiftY= new int[]{0,-1,1,0};
    void dfs(int i,int j, boolean[][] visit,ArrayList<ArrayList<Character>> arr,int row,int col){
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(i,j));
        while(!stack.isEmpty()){
            Pair p = stack.pop();
        for(int k=0;k<4;k++){
            int nx= p.x+ shiftX[k];
            int ny= p.y+ shiftY[k];
            if(isValid(nx,ny,visit,arr,row,col)){
                visit[nx][ny]=true;
                stack.push(new Pair(nx,ny));
            }
        }
        }
    }
    public void solve(ArrayList<ArrayList<Character>> arr) {
        int row = arr.size();
        int col= arr.get(0).size();
        boolean[][] visit = new boolean[row+1][col+1];
        for(int i=0;i<row;i++)
        for(int j=0;j<col;j++){
            if((i==0 || j==0 || i==row-1 || j==col-1) && (arr.get(i).get(j)=='O' && !visit[i][j])){
                visit[i][j]=true;
                dfs(i,j,visit,arr,row,col);
            }
        }
        for(int i=0;i<row;i++)
        for(int j=0;j<col;j++){
            if(!visit[i][j]){
                arr.get(i).set(j,'X');
            }
        }
    }
}
