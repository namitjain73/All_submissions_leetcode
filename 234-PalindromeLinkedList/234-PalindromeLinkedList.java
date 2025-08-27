// Last updated: 8/28/2025, 2:50:52 AM
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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        ListNode first = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        ListNode pre = null;
        slow.next = null;
        while(second != null){
            ListNode temp = second.next;
            second.next = pre;
            pre = second;
            second = temp;
        }

        second = pre;
        while(second != null){
            if(first.val != second.val) return false;
            first = first.next;
            second = second.next;
        }

        return true;
        
    }
}