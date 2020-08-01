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
    public TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) 
    {
        return helper(0,0,B.size()-1,A,B);
    }
    public TreeNode helper(int preSt, int inSt,int inEnd,ArrayList<Integer> A,ArrayList<Integer> B)
    {
        if(preSt>A.size()-1||inSt>inEnd)
        return null;
        TreeNode root=new TreeNode(A.get(preSt));
        int in=0;
        for(int i=inSt;i<=inEnd;i++)
        {
            if(root.val==B.get(i))
            in=i;
        }
        root.left=helper(preSt+1,inSt,in-1,A,B);
        root.right=helper(preSt+in-inSt+1,in+1,inEnd,A,B);
        return root;
    }
}
