// Last updated: 8/28/2025, 2:48:31 AM
class Solution {
    public int fib(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        int a = 0;
        int b = 1;
        int c = a+b;
        for(int i = 1 ; i < n ; i++){
            c= a+b;
            a = b;
            b = c;

        }
        return c;
        
    }
}