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
//      public int isBalanced(TreeNode A) {

// // if node is leaf => true
// if (A.left == null && A.right == null) {
// return 1;
// }

// // if left is null and right has more than 1 level => false
// if (A.left == null) {
// if (A.right.left != null || A.right.right != null) {
// return 0;
// }
// return 1;
// }

// // if right is null and left has more than 1 level => false
// if (A.right == null) {
// if (A.left.left != null || A.left.right != null) {
// return 0;
// }

// return 1;
// }

// // check if left balanced
// if (isBalanced(A.left) == 0) {
// return 0;
// }

// // check if right balanced
// if (isBalanced(A.right) == 0) {
// return 0;
// }

// // both left and right are balanced
// return 1;
// }
// }
    public int isBalanced(TreeNode A) {
        // if(A.right==null&&A.left==null)
        // return 1;
        if(A!=null)
        {
        if(isBalanced(A.left)==1&&isBalanced(A.right)==1&&Math.abs(finddepth(A.right)-finddepth(A.left))<=1)
        return 1;
        else
        return 0;
        }
        else
        return 1;
    }
    public static int finddepth(TreeNode a)
    {
        if(a==null)
        return 0;
        return Math.max(finddepth(a.left),finddepth(a.right))+1;
    }
}

