/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode A) {
        ListNode temp=A;
        ListNode x=A;
        while(temp!=null&&temp.next!=null)
        {
            int t=temp.val;
            temp.val=temp.next.val;
            temp.next.val=t;
            temp=temp.next.next;
        }
        return x;
    }
}
