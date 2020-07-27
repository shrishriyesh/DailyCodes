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
    public int hasPathSum(TreeNode A, int B) {
        if(A.left==null&&A.right==null)
        {
            if(B-A.val==0)
            return 1;
        }
        if(A.left!=null)
        {
            if(hasPathSum(A.left,B-A.val)==1)
            return 1;
        }
        if(A.right!=null)
        {
            if(hasPathSum(A.right,B-A.val)==1)
            return 1;
        }
        return 0;
    }
}
