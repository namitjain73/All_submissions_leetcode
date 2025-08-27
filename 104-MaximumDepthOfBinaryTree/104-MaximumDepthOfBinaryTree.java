// Last updated: 8/28/2025, 2:51:56 AM
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
    public int maxDepth(TreeNode root) {
        return helper(root,0);
    }
    public int helper(TreeNode root , int n){
        if(root == null) return 0;
        int left = helper(root.left,n+1);
        int right = helper(root.right,n+1);
        return 1 + Math.max(left,right);
    }
}