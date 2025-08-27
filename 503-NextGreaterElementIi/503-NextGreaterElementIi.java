// Last updated: 8/28/2025, 2:49:48 AM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i = 0 ; i < nums.length ; i++){
            ans[i] = -1;
        }
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < nums.length*2 ; i++){
            while(!st.empty() && nums[i%n] > nums[st.peek()]){
                ans[st.pop()] = nums[i%n];
            }
            st.push(i%n);
        }

        return ans;
    }
}