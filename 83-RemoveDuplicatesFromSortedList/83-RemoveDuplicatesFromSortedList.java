// Last updated: 8/28/2025, 2:52:08 AM
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pre = head;
        ListNode temp = head;
        while(temp != null){
            if(pre == temp){
                temp = temp.next;
                continue;
            }
            if(temp.val == pre.val){
                pre.next = pre.next.next;
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