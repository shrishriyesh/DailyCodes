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
    int answer;
    public int maxPathSum(TreeNode A) {
        if(A==null)
        return 0;
        answer=Integer.MIN_VALUE;
        helper(A);
        return answer;
    }
    public int helper(TreeNode A)
    {
        if(A==null)
        return 0;
        int l=helper(A.left);
        int r=helper(A.right);
        answer=Math.max(answer,A.val+l+r);
        return Math.max(0,A.val+Math.max(l,r));
    }
}
