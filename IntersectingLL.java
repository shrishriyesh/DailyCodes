/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode a, ListNode b) {
       ListNode temp1=a;
       ListNode temp2=b;
       int c1=count(temp1);
       int c2=count(temp2);
       int diff=Math.abs(c1-c2);
       if(c1>c2)
       {temp1=a;
        temp2=b;}
        else
        {
            temp1=b;
            temp2=a;
        }
        int c=0;
        while(c<diff)
        {
            temp1=temp1.next;
            c++;
        }
        while(temp1!=temp2)
        {
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;   
    }
    public static int count(ListNode head)
    {   int c=0;
        while(head!=null)
        {
            c++;
            head=head.next;
        }
        return c;
    }
}
