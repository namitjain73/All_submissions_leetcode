// Last updated: 8/28/2025, 2:51:00 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int n = 0;
    public void count(TreeNode root){
        if(root == null) return;
        n++;
        count(root.left);
        count(root.right);
    }
    public int countNodes(TreeNode root) {
        count(root);
        return n;
    }
}