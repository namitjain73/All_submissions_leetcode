// Last updated: 8/28/2025, 2:51:33 AM
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode Fast = head;
        while(Fast != null && Fast.next != null){
            slow = slow.next;
            Fast = Fast.next.next;
            if(slow == Fast) return true;
        }
        return false;
    }
}