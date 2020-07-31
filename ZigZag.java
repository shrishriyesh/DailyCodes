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
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
    Queue<TreeNode> q=new LinkedList<>();
    q.add(A);
    int d=0;
    while(!q.isEmpty()){
        ArrayList<Integer> temp=new ArrayList<Integer>();
        int n=q.size();
        for (int i=0;i<n;i++){
            TreeNode x=q.poll();
            temp.add(x.val);
            if (x.left!=null) q.add(x.left);
            if (x.right!=null) q.add(x.right);
        }
        if (d==1) Collections.reverse(temp);
        d=(d+1)%2;
        ans.add(temp);
    }
    return ans;
    }
//     public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode a) {
	    
// 	    if(a==null)
// 	       return null; 
	       
// 	    Stack<TreeNode> evenStack = new Stack<TreeNode>();
// 	    Stack<TreeNode> oddStack = new Stack<TreeNode>();
// 	    evenStack.push(a);
	    
// 	    ArrayList<ArrayList<Integer>> main = new ArrayList<ArrayList<Integer>>(); 
	    
// 	    while(!evenStack.isEmpty() || !oddStack.isEmpty())
// 	    {
	        
// 	        ArrayList<Integer> evenLevel = new ArrayList<Integer>(); 
// 	        while(!evenStack.isEmpty())
// 	        {
// 	            TreeNode node = evenStack.pop();
// 	            evenLevel.add(node.val);
	            
// 	            if(node.left !=null)
// 	               oddStack.push(node.left);
	            
// 	            if(node.right !=null)
// 	               oddStack.push(node.right);
// 	        }
// 	        if(evenLevel.size()>0)
// 	             main.add(evenLevel);
	        
// 	        ArrayList<Integer> oddLevel = new ArrayList<Integer>(); 
	        
// 	        while(!oddStack.isEmpty())
// 	        {
// 	            TreeNode node = oddStack.pop();
// 	            oddLevel.add(node.val);
	            
// 	            if(node.right !=null)
// 	               evenStack.push(node.right);
	            
// 	            if(node.left !=null)
// 	               evenStack.push(node.left);
// 	        }
// 	        if(oddLevel.size()>0)
// 	            main.add(oddLevel);
// 	    }
// 	    return main; 
// 	}
}
