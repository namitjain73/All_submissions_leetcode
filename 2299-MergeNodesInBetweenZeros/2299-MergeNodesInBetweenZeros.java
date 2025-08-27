// Last updated: 8/28/2025, 2:47:04 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = head.next;
        ListNode ll = new ListNode();
        head = ll;
        int c = 0;
        while(dummy != null){
            if(dummy.val != 0){
                c += dummy.val;
            }
            else {
                ListNode temp = new ListNode(c);
                c = 0;
                ll.next = temp;
                ll = ll.next;
            }

            dummy  = dummy.next;
        }
        return head.next;
        
    }
}