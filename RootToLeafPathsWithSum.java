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
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {
        ArrayList<ArrayList<Integer>> out=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        helper(res,out,A,B);
        return out;
    }
    public void helper(ArrayList<Integer> res,ArrayList<ArrayList<Integer>> out,TreeNode A,int B)
    {   if(A==null)
        return;
        res.add(A.val);
        B-=A.val;
        if(A.left==null&&A.right==null)
        {
            if(B==0)
            {
                //res.add(A.val);
                out.add(new ArrayList<>(res));
            }
            res.remove(res.size()-1);
            return;
        }
        if(A.left!=null)
        helper(res,out,A.left,B);
        if(A.right!=null)
        helper(res,out,A.right,B);
         res.remove(res.size()-1);
        return;
    }

}
