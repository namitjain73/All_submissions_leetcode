// Last updated: 8/28/2025, 2:49:43 AM
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
    int sum = 0;
    public void Inorder(TreeNode root){
        if(root == null) return;

        Inorder(root.right);
        sum += root.val;
        root.val = sum;
        Inorder(root.left);
    }
    public TreeNode convertBST(TreeNode root) {
        Inorder(root);
        return root;
    }
}