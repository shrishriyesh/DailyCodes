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
    public int isSameTree(TreeNode A, TreeNode B) {
        if(A==null&&B==null)
        return 1;
        if(A==null||B==null)
        return 0;
        if(A.val==B.val)
        return isSameTree(A.right,B.right)&isSameTree(A.left,B.left);
        else
        return 0;
    }
}
