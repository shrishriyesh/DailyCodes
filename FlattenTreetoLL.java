/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
   
    public TreeNode flatten(TreeNode a) {
         ArrayList<Integer> out=new ArrayList<>();
      TreeNode res=new TreeNode(-1);
      TreeNode head=res;
        if(a==null)
        return null;
        helper(a,out);
        for(int i=0;i<out.size();i++)
        {   
            TreeNode next=new TreeNode(out.get(i));
            res.right=next;
            res=res.right;
        }
        res.right=null;
        return head.right;
        
    }
    public void helper(TreeNode A ,ArrayList<Integer> o)
    {   if(A==null)
        return;
        else
        {
        o.add(A.val);
        helper(A.left,o);
        helper(A.right,o);
        }
            
        }
}
// public class Solution {
// public TreeNode flatten(TreeNode a) {
// return(flatt(a));
// }
// public TreeNode flatt(TreeNode root){//returns head of flattened list
// if(root==null)
// return(null);
// TreeNode l=flatt(root.left);
// TreeNode r=flatt(root.right);
// root.left=null;
// root.right=merge(l,r);
// return(root);
// }
// public TreeNode merge(TreeNode l,TreeNode r){//mergeflattened left tree with flattened right tree
// if(l==null&&r==null)
// return(null);
// if(l==null&&r!=null)
// return(r);
// if(r==null&&l!=null)
// return(l);
// TreeNode h=l;
// while(h.right!=null)
// h=h.right;
// h.right=r;
// return(l);
// }
// }
