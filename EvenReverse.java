/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode solve(ListNode A) {
        if(A.next==null||A.next.next==null||A.next.next.next==null)
        return A;
        ListNode temp=A;
        Stack<Integer> st=new Stack<>();
        int c=0;
        while(temp!=null)
        {   c++;
            if(c%2==0)
            st.push(temp.val);
            temp=temp.next;
        }
        temp=A;
        c=0;
        while(temp!=null)
        {c++;
            if(c%2==0)
            {
                temp.val=st.pop();
            }
            temp=temp.next;
        }
        return A;
    }
}
