public class Solution {
    int move[][]={{1,0},{-1,0},{0,1},{0,-1}};
    public int exist(ArrayList<String> A, String B) {
        boolean vis[][]=new boolean[A.size()][A.get(0).length()];
        for(int i=0;i<A.size();i++)
        {
            for(int j=0;j<A.get(i).length();j++)
            {
                if(A.get(i).charAt(j)==B.charAt(0))
                if(dfs(A,i,j,0,B))
                return 1;
            }
        }
        return 0;
    }
    public boolean dfs(ArrayList<String> A,int x, int y, int len, String B){
        // if we reach end of word
        if(len ==B.length() ) return true;
        // checking boundaries && next character is required one or not
        if(x<0 || y<0 || x>=A.size() || y>=A.get(x).length() || A.get(x).charAt(y) != B.charAt(len) )
            return false;
        // porceed to next char in adj directons and check
        boolean found = dfs(A, x+1,y,len+1,B) || dfs(A, x,y+1,len+1,B)
                       || dfs(A, x-1,y,len+1,B)  || dfs(A, x,y-1,len+1,B);
        return found;
    }
}
