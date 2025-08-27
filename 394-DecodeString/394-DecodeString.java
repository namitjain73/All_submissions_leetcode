// Last updated: 8/28/2025, 2:50:13 AM
class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();


        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(s.charAt(i) != ']'){
                st.push(ch);
            }
            else{
                String subs = "";
                String count = "";
                while(st.peek() != '['){
                    subs = st.pop() + subs;
                }
                st.pop();
                while(!st.empty()  && Character.isDigit(st.peek())){
                    count  = st.pop() + count;
                }
                int n = Integer.parseInt(count);
                while(n-- > 0){
                    for(char c : subs.toCharArray()){
                        st.push(c);
                    }
                }
            }
        }

        StringBuilder sb =new StringBuilder();
        while(!st.empty()){
            sb.append(st.pop());

        }
        return sb.reverse().toString();
    }
}