/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode A, int B, int C) {
        if(B==C)
        return A;
        int k=B;
        ListNode temp=A;
        int c=0;
        while(temp!=null)
        {temp=temp.next;c++;}
        if(c==C&&B==1)
        return rev(A);
        ListNode first=A;
        ListNode sec=A;
        ListNode prev=null;
        while(B>1)
        {
            prev=first;
            first=first.next;
            B--;
        }
        ListNode revst=first;
        while(C>k)
        {
            first=first.next;
            C--;
        }
        if(first.next!=null)
        {
            sec=first.next;
            first.next=null;
        }
        else
        {
            ListNode revLN=rev(revst);
            prev.next=revLN;
            return A;
        }
        if(k!=1)
        {ListNode revLN=rev(revst);
        prev.next=revLN;
        while(prev.next!=null)
        prev=prev.next;
        prev.next=sec;
        return A;}
        else
        {ListNode revLN=rev(revst);
        ListNode head=revLN;
        while(revLN.next!=null)
        revLN=revLN.next;
        revLN.next=sec;
        return head;
        }
        
    }
    public static ListNode rev(ListNode head)
    {
        ListNode next=null;
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
