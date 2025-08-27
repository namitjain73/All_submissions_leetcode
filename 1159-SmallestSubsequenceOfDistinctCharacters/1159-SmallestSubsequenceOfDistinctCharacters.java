// Last updated: 8/28/2025, 2:48:18 AM
class Solution {
    public String smallestSubsequence(String s) {
        int[] lastidx = new int[26];
        boolean[] arr = new boolean[26];
        Stack<Character> st = new Stack<>();

        for(int i = 0 ; i < s.length() ; i++){
            lastidx[s.charAt(i) - 'a'] = i;
        }

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            int idx = ch - 'a';

            if(arr[idx]) continue;

            while(!st.empty() && ch < st.peek() && i < lastidx[st.peek() - 'a']){
                arr[st.pop() - 'a'] = false;
            }
            arr[idx] = true;
            st.push(ch);
        }

        StringBuilder sb = new StringBuilder();
        while(!st.empty()){
            sb.append(st.pop());
        }

        return sb.reverse().toString();


    }
}