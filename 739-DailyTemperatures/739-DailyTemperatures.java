// Last updated: 8/28/2025, 2:49:16 AM
class Solution {
    public int[] dailyTemperatures(int[] temp) {
        return helper(temp);
    }
	public int[] helper(int[] arr) {
		int[] ans = new int[arr.length];
		
		Stack<Integer> st = new Stack<>();
		for(int i = arr.length-1 ; i >= 0 ; i--){
		    while(!st.empty() && arr[i] >= arr[st.peek()]){
		        st.pop();
		    }
		    if(st.empty()) ans[i] = 0;
		    else ans[i] = st.peek() - i;
		    st.push(i);
		}	
		return ans;
	}
}