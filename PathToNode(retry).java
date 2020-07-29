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
    public ArrayList<Integer> solve(TreeNode A, int B) {
        Stack<Integer> out=new Stack<>();
        helper(A,B,out);
        ArrayList<Integer> res=new ArrayList<>();
        while(!out.isEmpty())
        {   
            res.add(out.pop());
        }
        return res;
    }
    public void helper(TreeNode A, int B,Stack<Integer> out)
    {
        if(A==null)
        {
           
            return;
        }
        
        if(A.val==B)
        {out.push(A.val);
        return;}

        helper(A.left,B,out);
        if(out.size()>0)
        {
            out.push(A.val);
            return;
            
        }
        helper(A.right,B,out);
        if(out.size()>0)
        {
            out.push(A.val);
            return;
        }
    }
}
