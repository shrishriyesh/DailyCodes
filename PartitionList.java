/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode A, int B) {
        ListNode first=null;
        ListNode sec=null;
        ListNode big=null;
        ListNode small=null;
        if(A.next!=null)
        {
        while(A!=null)
        {
            if(A.val<B)
            {
                if(first==null)
                {
                   first=new ListNode(A.val);
                   small=first;
                }
                else
                {
                    first.next=new ListNode(A.val);
                    first=first.next;
                }
            }
            else
            {
                if(sec==null)
                {
                   sec=new ListNode(A.val);
                   big=sec;
                }
                else
                {
                    sec.next=new ListNode(A.val);
                    sec=sec.next;
                }
            }
            A=A.next;
        }
        }
        else
        return A;
        if(first!=null)
        {first.next=big;
        return small;}
        else
        {
            sec.next=null;
            return big;
        }
    }
}
