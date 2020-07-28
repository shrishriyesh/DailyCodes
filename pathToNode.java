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
    // public ArrayList<Integer> solve(TreeNode A, int B) {
    //     Stack<Integer> out=new Stack<>();
    //     helper(A,B,out);
    //     ArrayList<Integer> res=new ArrayList<>();
    //     for(int i=0;i<out.size();i++)
    //     {
    //         res.add(out.pop());
    //     }
    //     Collections.sort(res,Collections.reverseOrder());
    //     return res;
    // }
    // public void helper(TreeNode A, int B,Stack<Integer> out)
    // {
    //     if(A==null)
    //     {
    //         out.pop();
    //         return;
    //     }
    //     out.push(A.val);
    //     if(A.val==B)
    //     return;
    //     helper(A.left,B,out);
    //     helper(A.right,B,out);
    // }
    public boolean  solve(TreeNode root, int n, ArrayList<Integer> res ){
    if(root == null) return false;
    res.add(root.val);
    if(root.val == n) return true;
    if(solve(root.left,n,res) || solve(root.right,n,res)) return true;
    res.remove(res.size() -1);
    return false;
}

public ArrayList<Integer> solve(TreeNode A, int B) {
    ArrayList<Integer> res = new ArrayList<>();
    solve(A,B,res);
    return res;
}
}
