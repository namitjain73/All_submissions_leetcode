// Last updated: 8/28/2025, 2:53:09 AM
class Solution {
    public boolean isPalindrome(int x) {
        int ans = 0;
        int n = x;
        while(x > 0){
            int rem = x % 10;
            x = x / 10;
            ans = ans*10 + rem;
        }
        if (ans ==  n){
            return true;
        }
        else{
            return false;
        }
    }
}