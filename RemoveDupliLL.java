/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode prev=A;ListNode n=A.next;
        while(n!=null)
        {
            if(n.val!=prev.val)
            {
                prev.next=n;
                prev=n;
            }
            n=n.next;
        }
        prev.next=n;
        prev=n;
        return A;
        
    }
}
