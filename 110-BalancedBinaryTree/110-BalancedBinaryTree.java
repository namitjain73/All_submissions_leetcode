// Last updated: 8/28/2025, 2:51:49 AM
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
    boolean ans = true;
    public int height(TreeNode root){
        if(root == null ) return 0;
        int left = height(root.right);
        int right = height(root.left);
        if(Math.abs(left - right) > 1) ans = false;
        return 1 + Math.max(left,right);
    }
    public boolean isBalanced(TreeNode root) {
        height(root);
        return ans;
    }
}