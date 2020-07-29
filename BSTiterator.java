/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {
    Stack<Integer> st=new Stack<>();
    public Solution(TreeNode root) {
        st=new Stack<>();
        helper(root);
    }
    public void helper(TreeNode root)
    {
        if(root==null)
        return;
        helper(root.left);
        st.push(root.val);
        helper(root.right);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return st.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        if(!st.isEmpty())
        return st.pop();
        return -1;
    }
}
// public class Solution {
// private Stack<TreeNode> lst;
// public Solution(TreeNode root) {
// lst = new Stack();
// ret(root);

// }

// /** @return whether we have a next smallest number */
// public boolean hasNext() {
//     return !lst.isEmpty();
// }

// /** @return the next smallest number */
// public int next() {
//             if(hasNext()){
//             TreeNode temp = lst.pop();
//              ret(temp.right);   
//              return temp.val;
//             }
//             return -1;
        
// }

// public void ret(TreeNode root){
//     while(root!=null){
//             lst.push(root);
//             root = root.left;
//         }
        
//     }
// }

/**
 * Your Solution will be called like this:
 * Solution i = new Solution(root);
 * while (i.hasNext()) System.out.print(i.next());
 */
