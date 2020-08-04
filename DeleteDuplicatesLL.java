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
    if(A==null||A.next==null)
    return A;
    while(A.val!=A.next.val)
    {
        A.next=deleteDuplicates(A.next);
        return A;
    }
    ListNode target=A;
    while(target!=null&&A.val==target.val)
    {
        target=target.next;
    }
    return deleteDuplicates(target);
    }
}
