// Last updated: 8/28/2025, 2:47:24 AM
class Solution {
    public int getLucky(String s, int k) {
        String s1 ="";
        int n = 0;
        for(int i = 0 ; i < s.length() ;i++){
            s1 += Integer.toString(s.charAt(i)-'a' + 1);
        }
        // n = int(s);
        
        while(k > 0){
            n = 0;
            for(int i = 0 ; i< s1.length() ;i++){
                n += s1.charAt(i) - '0';
            }
            k--;
            s1 = Integer.toString(n);


        }
        return n;
    }
}