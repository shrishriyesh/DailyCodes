/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int solve(ListNode A, int k) {
        
         int n=1;
         ListNode temp=A;
         while(temp!=null)
         {
             n++;
             temp=temp.next;
         }
        int reqNode = ((n + 1) / 2) - k; 
  
        // If no such node exists, return -1 
        if(reqNode <= 0) 
            return -1; 
        else
        { 
            ListNode current = A; 
            int count = 1,ans = 0; 
            while (current != null)  
            {  
                if (count == reqNode)  
                { 
                    ans = current.val; 
                    break;  
                } 
                count++;  
                current = current.next;  
            } 
            return ans; 
    }
}
}
