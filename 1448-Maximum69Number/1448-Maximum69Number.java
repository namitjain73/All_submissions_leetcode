// Last updated: 8/28/2025, 2:48:04 AM
class Solution {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        // for(int i = 0 ; i < s.length() ; i++){

        // }
        s = s.replaceFirst("6","9");
        return Integer.parseInt(s);

        
    }
}