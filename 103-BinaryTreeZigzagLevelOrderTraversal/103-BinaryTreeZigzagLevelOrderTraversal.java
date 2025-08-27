// Last updated: 8/28/2025, 2:51:57 AM
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
    public int level(TreeNode root , int n ){
        if(root == null) return 0;
        int left = level(root.left,n+1);
        int right = level(root.right,n+1);
        return 1 + Math.max(left,right);
    }
    public List<Integer> level1(TreeNode root , int n ,List<Integer> list){
        if(root == null) return list;
        if(n == 1){
            list.add(root.val);
            return list;
        }
        level1(root.left,n-1,list);
        level1(root.right,n-1,list);
        return list;
    }
    public List<Integer> level2(TreeNode root , int n ,List<Integer> list){
        if(root == null) return list;
        if(n == 1){
            list.add(root.val);
            return list;
        }
        level2(root.right,n-1,list);
        level2(root.left,n-1,list);
        return list;
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ll = new ArrayList<>();
        int level = level(root,0);
        for(int i = 1 ; i <= level ; i++){
            if(i % 2 != 0){
                ll.add(level1(root,i,new ArrayList<>()));
            }else{
                ll.add(level2(root,i,new ArrayList<>()));
            }
        }
        return ll;
    }
}