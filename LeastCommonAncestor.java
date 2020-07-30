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
  int ans = -1;

public boolean findN(TreeNode node, int B, int C)
{
    
    if(ans != -1)
        return false;
    if(node == null)
        return false;
    
    boolean left = findN(node.left, B, C);
    boolean right = findN(node.right, B, C);
    if(node.val == B || node.val == C)
    {
        if(B == C)
        {
            ans = node.val;
            return true;
        }
        if(left || right)
        {
            ans = node.val;
            return true;
        }
        return true;
    }
    if(left && right)
    {
        ans = node.val;
        return true;
    }
    return left || right;
}
// int n11=0;
// int n22=0;
public int lca(TreeNode A, int B, int C) {
    
    findN(A, B, C);
     return ans;
}
// public TreeNode findN(TreeNode A,int B, int C)
// {
//     if(A==null)
//     return null;
//     if(A.val==B||A.val==C)
//     return A;
//     TreeNode left=findN(A.left,B,C);
//     TreeNode right=findN(A.right,B,C);
//     if(B==A.val)
// 	        n11=1;
// 	    if(C==A.val)
// 	       n22=1;
//     if(left==null)
//     return right;
//     if(right==null)
//     return left;
//     return A;
// }
}
