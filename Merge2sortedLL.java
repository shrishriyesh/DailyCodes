/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode t1=head1;
        ListNode t2=head2;
        if(head1.val>head2.val)
        {
            ListNode h3=head2;
            ListNode t3=head2;
            t2=t2.next;
            h3=helper(t1,t2,t3);
           return h3;
        }
        else
        {
            ListNode h3=head1;
            ListNode t3=head1;
            t1=t1.next;
            h3=helper(t1,t2,t3);
            return h3;
        }
       
	
    }
    public static ListNode helper(ListNode t1,ListNode t2,ListNode t3) 
    {   ListNode head= t3;
        while((t1!=null)&&(t2!=null))
        {
            if(t1.val<t2.val)
            {
                t3.next=t1;
                t1=t1.next;
                t3=t3.next;
            }
            else
            {
                t3.next=t2;
                t2=t2.next;
                t3=t3.next;
            }
        }
        if(t1==null)
        {
            while(t2!=null)
            {
                t3.next=t2;
                t2=t2.next;
                t3=t3.next;
            }
        }
		if(t2==null)
        {
            while(t1!=null)
            {
                t3.next=t1;
                t1=t1.next;
                t3=t3.next;
            }
        }
      return head; 
        }
    
}
