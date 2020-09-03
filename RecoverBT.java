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
    TreeNode firstNode = null, lastNode = null, previousNode = null;
    ArrayList<Integer> result;
    public ArrayList<Integer> recoverTree(TreeNode A) {
    
        result = new ArrayList<>();
        traverseTreeToFindSwappedPair(A);
        result.add(lastNode.val);
        result.add(firstNode.val);
        return result;
        
    }
    
    public void traverseTreeToFindSwappedPair(TreeNode root){
        if (root == null) return;
        traverseTreeToFindSwappedPair(root.left);
        if(previousNode != null){
            if(previousNode.val > root.val){
                if(firstNode == null)
                {
                    firstNode = previousNode;
                }
                else
                {
                    lastNode = root;
                }
            }
        }
        previousNode = root;
        traverseTreeToFindSwappedPair(root.right);
    }
}
