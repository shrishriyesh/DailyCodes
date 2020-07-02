/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        //count
        ListNode temp=A;
        int c=0;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        int k=c-B;
        if(k<=0)
        {
            A=A.next;
            return A;
        }
        ListNode prev=A;
        ListNode temp1=A;
        for(int i=0;i<k;i++)
        {
                prev =temp1;
                temp1 = temp1.next;
        }
            prev.next = temp1.next;
        return A;
    }
}
