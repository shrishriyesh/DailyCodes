/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode A, int B) 
    {
        //count
        int c=0;
        ListNode temp=A;
        while(temp!=null)
        {
            temp=temp.next;
            c++;
        }
       
        B=B%c;
        if(B==c||c==1||B==0)
        return A;
         B++;
        temp=A;
        B=c-B;
        while(B!=0)
        {temp=temp.next;B--;}
        ListNode temp2=temp.next;
        ListNode head=temp2;
        temp.next=null;
        while(temp2.next!=null)
        temp2=temp2.next;
        temp2.next=A;
        return head;
    }
}
