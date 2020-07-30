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
    public ArrayList<Integer> solve(TreeNode A) {
        ArrayList<Integer> out=new ArrayList<>();
        TreeNode temp=A;
        Queue<TreeNode> q=new LinkedList<>();
        while(temp!=null)
        {
            q.add(temp);
            temp=temp.right;
        }
        while(!q.isEmpty())
        {
            temp=q.poll();
            out.add(temp.val);
            if(temp.left!=null)
            {temp=temp.left;
            while(temp!=null)
                {
                    q.add(temp);
                    temp=temp.right;
                }
            }
        }
        return out;
    }
}
