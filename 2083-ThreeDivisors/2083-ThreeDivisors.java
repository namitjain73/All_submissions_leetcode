// Last updated: 8/28/2025, 2:47:23 AM
class Solution {
    public boolean isThree(int n) {
        int x = 0;
        for(int i = 2 ; i < n ; i++){
            if(n % i == 0){
                x++;
            }
        }
        if(x == 1) return true;
        return false;
        
    }
}