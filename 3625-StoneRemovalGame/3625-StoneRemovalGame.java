// Last updated: 8/28/2025, 2:45:49 AM
class Solution {
    public boolean canAliceWin(int n) {
        int ans =0;
        int count = 10;
        while(n >= count){
            n -= count;
            count -=1;
            ans++;
        }
        return ans%2!=0;
        
    }
}