public class Solution {
    public int solve(String A) {
        String B="";
        for(int i=A.length()-1;i>=0;i--)
        {
            B=B+A.charAt(i);
        }
        int mat[][]=new int[A.length()+1][A.length()+1];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat.length;j++)
            {
                if(i==0||j==0)
                mat[i][j]=0;
                else
                {
                    if(A.charAt(i-1)==B.charAt(j-1))
                    mat[i][j]=mat[i-1][j-1]+1;
                    else
                    {
                        mat[i][j]=Math.max(mat[i-1][j],mat[i][j-1]);
                    }
                }
            }
        }
        return mat[mat.length-1][mat.length-1];
    }
}
