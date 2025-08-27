// Last updated: 8/28/2025, 2:51:11 AM
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        ListNode pre = head;
        while(temp != null){
            if(temp.val == val && temp == head){
                head = head.next;
                temp = head;
                continue;
            }
            else if(temp.val == val){
                pre.next = temp.next;
                temp.next = null;
                temp = pre.next;
            }
            else{
                pre = temp;
                temp = temp.next;
            }
        }
        return head;
        
    }
}