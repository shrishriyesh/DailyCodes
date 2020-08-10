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
    public int sumNumbers(TreeNode A) {
        if(A==null)
        return 0;
        helper(A,0);
        return answer%1003;
    }
    public void helper(TreeNode A, int num)
    {
        if(A==null)
        return;
        num=((num*10)+A.val)%1003;
        if(A.left==null&&A.right==null)
        {
            answer=answer%1003+num%1003;
            num=0;
            return;
            
        }
        helper(A.left,num);
        helper(A.right,num);
    }
}
