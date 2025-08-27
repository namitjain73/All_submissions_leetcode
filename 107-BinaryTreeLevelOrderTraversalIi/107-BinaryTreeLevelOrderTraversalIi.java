// Last updated: 8/28/2025, 2:51:52 AM
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
    public int level(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(level(root.left),level(root.right));
    }
    public void levelorder(TreeNode root ,int n, List<Integer> list){
        if(root == null) return;
        if(n == 1) {
            list.add(root.val);
            return;
        }

        levelorder(root.left,n-1,list);
        levelorder(root.right,n-1,list);
        return;
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        int level = level(root);
        

        List<List<Integer>> ll = new ArrayList<>();
        for(int i = level ; i  >= 1 ; i--){
            List<Integer> list = new ArrayList<>();
            levelorder(root,i,list);
            ll.add(list);
        }
        return ll;
    }
}

