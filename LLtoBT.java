/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode a) 
    {if(a==null)
    return null;
    if(a.next==null)
    return new TreeNode(a.val);
        ListNode temp=a;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        return helper(a);
    }
    public TreeNode helper(ListNode start)
    {
        if(start==null)
        return null;
        if(start.next==null)
        return new TreeNode(start.val);
        ListNode next=start;
        ListNode mid=start;
        ListNode prev=start;
        while(next!=null&&mid!=null&&next.next!=null)
        {   prev=mid;
            mid=mid.next;
            next=next.next.next;
        }
        ListNode temp=mid.next;
        mid.next=null;
        prev.next=null;
        TreeNode root=new TreeNode(mid.val);
        root.left=helper(start);
        root.right=helper(temp);
        return root;
    }
    
}
// public class Solution {
//     public TreeNode sortedListToBST(ListNode a) {
//         return helper(a);
//     }
//     public TreeNode helper(ListNode a){
//      if(a==null)return null;
//      if(a.next==null)return new TreeNode(a.val);
//      ListNode mid = findMid(a);
//      TreeNode curr = new TreeNode(mid.val);
//      curr.left = helper(a);
//      curr.right = helper(mid.next);
//      return curr;
//     }
//     public ListNode findMid(ListNode a){
//         ListNode prev = a;
//         ListNode slow = a;
//         ListNode fast = a;
//         while(fast!=null){
//             fast = fast.next;
//             if(fast==null)break;
//             fast = fast.next;
//             prev = slow;
//             slow = slow.next;
//         }
//         prev.next = null;
//         return slow;
//     }
// }
