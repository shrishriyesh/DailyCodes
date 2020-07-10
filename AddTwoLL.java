/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        ListNode fin=new ListNode(-1);
        ListNode head=fin;
        int carry=0;
        while(A!=null&&B!=null)
        {
            int sum=A.val+B.val+carry;
            if(sum<10)
            {
                carry=0;
                ListNode res=new ListNode(sum);
                fin.next=res;
                fin=fin.next;
            }
            else
            {
                carry=sum/10;
                sum=sum%10;
                ListNode res=new ListNode(sum);
                fin.next=res;
                fin=fin.next;
            }
            A=A.next;
            B=B.next;
        }
        ListNode C=null;
        if(A==null&&B!=null)
        C=B;
        else if(A!=null&&B==null)
        C=A;
        if(C==null&&carry!=0)
        {
            ListNode res=new ListNode(carry);
                fin.next=res;
                fin=fin.next;
        }
        else if(C!=null)
        {
            while(C!=null)
        {
            int sum=C.val+carry;
            if(sum<10)
            {
                carry=0;
                ListNode res=new ListNode(sum);
                fin.next=res;
                fin=fin.next;
            }
            else
            {
                carry=sum/10;
                sum=sum%10;
                ListNode res=new ListNode(sum);
                fin.next=res;
                fin=fin.next;
            }
            C=C.next;
        }
        }
        if(carry!=0)
        {
            ListNode res=new ListNode(carry);
                fin.next=res;
                fin=fin.next;
        }
        fin.next=null;
        return head.next;
    }
    }

