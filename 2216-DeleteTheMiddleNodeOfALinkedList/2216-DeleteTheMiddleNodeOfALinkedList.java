// Last updated: 8/28/2025, 2:47:13 AM
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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;
        ListNode mid = getMid(head);
        mid.next = mid.next.next;
        return head;

        
    }
    public ListNode getMid(ListNode head){
        ListNode pre = null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast !=null && fast.next != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return pre;
    }
}