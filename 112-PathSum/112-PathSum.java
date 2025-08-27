// Last updated: 8/28/2025, 2:51:47 AM
class Solution {
    boolean  ans= false;
    public void helper(TreeNode root , int t , int sum){
        if(root == null) return;
        sum += root.val;
        if(root.left == null && root.right == null && sum == t){
            ans = true;
            return;
        }

        helper(root.left,t,sum);
        helper(root.right,t,sum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        helper(root,targetSum , 0);
        return ans;
    }
}