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
//     HashMap<Integer, ArrayList> map = new HashMap<>();
// public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
// ArrayList<ArrayList<Integer>> list = new ArrayList<>();

//     int h =height(A);
//     for (int i = 0; i <= h ;i++) {
//         fillList(A, 0, i);

//     }
//     Object[] keys = map.keySet().toArray();
//     Arrays.sort(keys);
//     for (Object value : keys) {
//         list.add(map.get(value));
//     }
//     return list;
// }

//   int height(TreeNode root) { 
//     if (root == null) 
//       return 0; 
//     else
//     { 
//         int lheight = height(root.left); 
//         int rheight = height(root.right); 
          
//         if (lheight > rheight) 
//             return(lheight+1); 
//         else return(rheight+1);  
//     } 
// }

// public void fillList(TreeNode currNode, int Hlevel, int Vlevel) {
//     if (currNode == null)  
//         return;  
//     if (Vlevel == 1)  
//         insert(currNode.val, Hlevel);
//     else if (Vlevel > 1)  {  
//         fillList(currNode.left, Hlevel-1, Vlevel-1);  
//         fillList(currNode.right,Hlevel+1, Vlevel-1);  
//     }  
    
   
    
// }

// public void insert(int val, int level) {
//     ArrayList<Integer> temp;
//     if (map.containsKey(level)) {
//         temp = map.get(level);
//     } else {
//         temp = new ArrayList<Integer>();
//     }
//     temp.add(val);
//     map.put(level, temp);
// }
public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) 
    { 
        ArrayList<ArrayList<Integer>> out=new ArrayList<>();
          if(A==null)
            return out;
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        int minrange=0;
        int maxrange=0;
        Queue<TreeNode> q=new LinkedList<>();
        Queue<Integer> lvl=new LinkedList<>();
        q.add(A);
        lvl.add(0);
        while(!q.isEmpty())
        {
            TreeNode head=q.poll();
            int l=lvl.poll();
            if(!map.containsKey(l))
            map.put(l,new ArrayList<>());
            //if(head!=null)
            map.get(l).add(head.val);
            if(head.left!=null)
            {
                q.add(head.left);
                lvl.add(l-1);
                minrange=Math.min(minrange,l-1);
            }
            if(head.right!=null)
            {
                q.add(head.right);
                lvl.add(l+1);
                maxrange=Math.max(maxrange,l+1);
            }
        }
        for(int i=minrange;i<=maxrange;i++)
        {   
            if(map.containsKey(i))
            out.add(map.get(i));
        }
        return out;
    }
}

