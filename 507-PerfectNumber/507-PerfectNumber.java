// Last updated: 8/28/2025, 2:49:47 AM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int n = 0;
        for(int i=1 ; i < num ; i++){
            if(num % i == 0){
                n += i;
            }
        }
        return n == num;
        
    }
}