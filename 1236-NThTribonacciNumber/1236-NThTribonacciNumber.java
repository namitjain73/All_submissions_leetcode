// Last updated: 8/28/2025, 2:48:12 AM
class Solution {
    public int tribonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2) return b;

        for(int i = 2 ; i < n  ; i++){
            int d = a+b+c;
            a = b;
            b = c;
            c = d;
        }
        return c;
        
    }
}