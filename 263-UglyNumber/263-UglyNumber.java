// Last updated: 8/28/2025, 2:50:42 AM
class Solution {
    public boolean isUgly(int num) {
        for(int i = 2 ; i < 6 && num > 0; i++){
            while(num % i == 0){
                num = num / i;
            }
        }
        return num == 1;
        
    }
}