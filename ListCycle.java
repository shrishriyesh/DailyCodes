/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode a) {
        ListNode P = a;
 ListNode Q=  a;
 
 while(Q!=null && Q.next !=null){
     P=P.next;
     Q=Q.next.next;
     if(Q==P){
         while(a!=P){
             a=a.next;
             P=P.next;
         }
         return P;
     }
 }
 
 return null;
    }
}
