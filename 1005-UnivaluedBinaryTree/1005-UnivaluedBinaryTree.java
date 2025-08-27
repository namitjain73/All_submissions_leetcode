// Last updated: 8/28/2025, 2:48:34 AM
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
    boolean flag = true;
    public void cheak(TreeNode root , int n){
        if(root == null) return;
        if(root.val != n) {
            flag = false;
            return;
        }

        cheak(root.right , n);
        cheak(root.left , n );

    }
    public boolean isUnivalTree(TreeNode root) {
        int n = root.val;
        cheak(root , n);
        return flag;
    }
}