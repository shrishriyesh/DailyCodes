/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public int kthsmallest(TreeNode A, int B) {
        
        ArrayList<Integer> out=new ArrayList<>();
        solve(A,out);
        return out.get(B-1);
    }
    public void solve(TreeNode A,ArrayList<Integer> out)
    {
        if(A==null)
        return;
        solve(A.left,out);
        out.add(A.val);
        solve(A.right,out);
    }
}
