// Last updated: 8/28/2025, 2:52:54 AM
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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode pre = null;
        ListNode next = null;
        ListNode temp = null;
        ListNode kth = null;
        temp = head;

        while(temp != null){
            kth = getnode(temp , k);
            if(kth == null){
                if(pre != null) pre.next =  temp;
                break;
            }
            next = kth.next;
            kth.next = null;
            reverse(temp);
            if(temp == head){
                head = kth;
            }
            else{
                pre.next = kth;
            }

            pre = temp;
            temp = next;
        }
        return head;
    }

    public ListNode getnode(ListNode head , int n){
        n--;
        while(head != null && n-- > 0){
            head = head.next;
        }

        return head;
    }

    public void reverse(ListNode head){
        ListNode pre = null;
        ListNode temp = head;

        while(temp != null){
            ListNode curr = temp.next;
            temp.next = pre;
            pre = temp;
            temp = curr;
        }
    }
}