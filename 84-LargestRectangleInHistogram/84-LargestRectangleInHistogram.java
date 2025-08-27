// Last updated: 8/28/2025, 2:52:07 AM
class Solution {
    public int largestRectangleArea(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;

        for(int i = 0 ; i < arr.length ; i++){
            while(!st.empty() && arr[i] < arr[st.peek()]){
                int h = arr[st.pop()];
                int r = i;
                if(st.empty()){
                    ans = Math.max(ans,h*r);
                }else{
                    int l = st.peek();
                    ans = Math.max(ans , h * (r - l - 1));
                }
            }
            st.push(i);
        }

        int r = arr.length;
        while(!st.empty()){
            int h = arr[st.pop()];
            if(st.empty()){
                ans = Math.max(ans,h*r);
            }else{
                int l = st.peek();
                ans = Math.max(ans , h * (r - l - 1));
            }
        }
        return ans;
    }
}