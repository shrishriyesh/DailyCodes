public class Solution {
    public int maxp3(int[] A) {
        if(A.length<3)
        return 0;
        Arrays.sort(A);
        int x=A[A.length-1]*A[A.length-2]*A[A.length-3];
        int y=A[0]*A[1]*A[A.length-1];
        return Math.max(x,y);
    }
}
