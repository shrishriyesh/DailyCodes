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
    public int maxDepth(TreeNode A) {
        if(A==null)
        return 0;
        if(A.right==null&&A.left==null)
        return 1;
        int left=maxDepth(A.left)+1;
        int right=maxDepth(A.right)+1;
        return Math.max(left,right);
    }
}
