// Last updated: 8/28/2025, 2:50:48 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        if(node.next == null) {
            node = null;
            return;
        }
        while(node.next != null){
            node.val = node.next.val;
            if(node.next.next == null){
                node.next = node.next.next;
                return;
            }
            
            node = node.next;
            // else{
            //     node.val = node.next.val;
            //     node = node.next;
            // }
        }
        
    }
}