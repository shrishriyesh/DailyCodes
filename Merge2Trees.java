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
public TreeNode solve(TreeNode A, TreeNode B) {

    //if both nodes are null
    if(A==null && B==null)
    {
        return null;
    }
    //if A tree is null
    if(A==null)
    {
        return B;
    }
    
    //if B tree is null
    if(B==null)
    {
        return A;
    }
    //else
    if(A!=null && B!=null)
    {
        A.val+=B.val;
        A.left=solve(A.left,B.left);
        A.right=solve(A.right,B.right);
    }
    return A;
}
}
