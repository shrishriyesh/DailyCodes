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
    int out=1;
    public int minDepth(TreeNode A) {
        if(A==null)
        return 0;
        return helper(A);
        
    }
    public static int helper(TreeNode A)
    {   if(A==null)
    return 999999;
        if(A.left==null&&A.right==null)
        return 1;
        return Math.min(helper(A.left),helper(A.right))+1;
    }
}
