// Last updated: 8/28/2025, 2:47:54 AM
class Solution {
    public int maxPower(String s) {
        return con_char(s);
        
    }

    public static int con_char(String s){
        char[] ch = s.toCharArray();
        int n = s.length();
        int sum = 1;
        int max = 1;
        char c = ch[0];
        for(int i = 1 ; i < n ; i ++){
            if(c == ch[i]){
                sum++;
                max = Math.max(max,sum);
            }
            else{
                c = ch[i];
                sum = 1;
            }
        }
        return max;
    }
}