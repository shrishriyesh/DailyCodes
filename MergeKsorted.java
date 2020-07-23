/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode mergeKLists(ArrayList<ListNode> a) {
	    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	    for(ListNode x : a){
	        while(x != null){
	            minHeap.add(x.val);
	            x = x.next;
	        }
	    }
	    ListNode result = new ListNode(-1);
	    ListNode res = result;
	    while(!minHeap.isEmpty()){
	        result.next = new ListNode(minHeap.remove());
	        result = result.next;
	    }
	    return res.next;
	}
}
