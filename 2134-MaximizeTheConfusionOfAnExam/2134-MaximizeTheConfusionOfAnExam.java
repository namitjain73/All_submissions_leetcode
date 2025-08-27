// Last updated: 8/28/2025, 2:47:19 AM
class Solution {
    public int maxConsecutiveAnswers(String key, int k) {
        return Math.max(flip(key,k,'T'),flip(key,k,'F'));
    }
    public int flip(String key, int k, char ch){
        int left = 0;
        int c = 0;
        int maxlen = 0;
        for(int right = 0 ; right < key.length() ; right++){
            if(key.charAt(right) != ch) c++;

            while(c > k){
                if(key.charAt(left) != ch) c--;
                left++;
            }
            maxlen = Math.max(maxlen,right - left + 1);
        }
        return maxlen;
    }
}