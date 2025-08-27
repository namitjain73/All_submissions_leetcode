// Last updated: 8/28/2025, 2:51:59 AM
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
    public boolean isSymmetric(TreeNode root) {
        return symmetric(root.left , root.right);
        
    }
    public boolean symmetric(TreeNode p , TreeNode q){
        if(p == q) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        return symmetric(p.left,q.right) && symmetric(p.right,q.left);
    }
}