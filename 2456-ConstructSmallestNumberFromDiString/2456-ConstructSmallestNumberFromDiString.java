// Last updated: 8/28/2025, 2:46:47 AM
class Solution {
    public String smallestNumber(String str) {
        Stack<Integer> st = new Stack<>();
        int c = 1;
        int[] arr = new int[str.length()+1];
        for(int i = 0 ; i <= str.length() ; i++){
            if(i == str.length() || str.charAt(i) == 'I'){
                arr[i] = c;
                c++;
                while(!st.empty()){
                    arr[st.pop()] = c;
                    c++;
                }
            }else{
                st.push(i);
            }
        }

        while(!st.empty()){
            arr[st.pop()] = c;
            c++;
        }

        String s = "";
        for(int i = 0 ; i < arr.length ; i++){
            s += arr[i];
        }
        return s;
    }
}