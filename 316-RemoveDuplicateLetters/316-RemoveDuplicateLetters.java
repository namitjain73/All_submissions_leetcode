// Last updated: 8/28/2025, 2:50:31 AM
class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastidx = new int[26];
        boolean[] arr = new boolean[26];
        // String s = "";
        Stack<Character> st = new Stack<>();

        for(int i =0 ; i < s.length() ;i++){
            lastidx[s.charAt(i) - 'a'] = i;
        }

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            int idx = ch - 'a';
            if(arr[idx]) continue;


            while(!st.empty() && st.peek() > ch && lastidx[st.peek() - 'a'] > i ){
                arr[st.pop() - 'a'] = false;

            }

            st.push(ch);
            arr[idx] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : st) sb.append(c);


        return sb.toString();
        
    }
}