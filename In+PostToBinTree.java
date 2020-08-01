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
    public TreeNode buildTree(ArrayList<Integer> In, ArrayList<Integer> Po) {
        return helper(0,Po.size()-1,0,In.size()-1,In,Po);
    }
    public TreeNode helper(int poSt,int poEnd,int InSt,int InEnd,ArrayList<Integer> In, ArrayList<Integer> Po)
    {
        if(poSt>poEnd||InSt>InEnd)
        return null;
        int loc=-1;
        TreeNode root=new TreeNode(Po.get(poEnd));
        for(int i=InSt;i<=InEnd;i++)
        {
            if(root.val==In.get(i))
            loc=i;
        }
        
        int rpoEn=poEnd-1;
        int lpoSt=poSt;
        
        int rInSt=loc+1;
        int rInEn=InEnd;
        int lInSt=InSt;
        int lInEn=loc-1;
        int lpoEn=lInEn-lInSt+lpoSt;
        int rpoSt=lpoEn+1;
        root.left=helper(lpoSt,lpoEn,lInSt,lInEn,In,Po);
        root.right=helper(rpoSt,rpoEn,rInSt,rInEn,In,Po);
        return root;
    }
}

