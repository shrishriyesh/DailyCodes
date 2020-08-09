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
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        if(A==null)
        {
            return res;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(A);    
        while(!q.isEmpty())
        {
            int size=q.size();
            ArrayList<Integer> out=new ArrayList<>();
            for(int i=0;i<size;i++)
            {   TreeNode temp=q.poll();
                out.add(temp.val);
                if(temp.left!=null)
                q.add(temp.left);
                if(temp.right!=null)
                q.add(temp.right);
            }
            res.add(out);
        }
        return res;
    }
}
