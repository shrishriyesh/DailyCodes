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
    public int isSymmetric(TreeNode A) {
        return helper(A.left,A.right);
    }
    public int helper(TreeNode left, TreeNode right )
    {
        if(left==null&&right==null)
        return 1;
        if(left!=null&&right!=null)
        {   int flag=0;
            if(left.val!=right.val)
            return 0;
            else
            {
                return (helper(left.left,right.right)&helper(left.right,right.left));
            }
        }
        return 0;
    }
}
