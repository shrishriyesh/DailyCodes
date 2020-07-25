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
    ArrayList<Integer> out=new ArrayList<>();
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        Stack<TreeNode> st= new Stack<>();
        if(A==null)
        return out;
        st.push(A);
        while(st.size()!=0)
        {   TreeNode temp=st.pop();
            out.add(temp.val);
            if(temp.right!=null)
            st.push(temp.right);
            if(temp.left!=null)
            st.push(temp.left);
        }
        return out;
    }
    // public void Helper(TreeNode A)
    // {
    //     if(A==null)
    //     return;
    //     out.add(A.val);
    //     Helper(A.left);
    //     Helper(A.right);
    // }
}
