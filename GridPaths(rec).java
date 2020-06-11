public class Solution {
    int c=0;
    public int uniquePaths(int A, int B) 
    {
        if(A<=1||B<=1)//Base Case
        return 1;
        else
        {
            int shortans=0;
            shortans=uniquePaths(A-1,B)+uniquePaths(A,B-1);
            return shortans;
        }
    }
}
