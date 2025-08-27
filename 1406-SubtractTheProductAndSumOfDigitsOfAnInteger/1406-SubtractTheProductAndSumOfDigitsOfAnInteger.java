// Last updated: 8/28/2025, 2:48:09 AM
class Solution {
    public int subtractProductAndSum(int n) {
        int p = 1;
        int s = 0;
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            p *= rem;
            s += rem ;
            
        }
        p = p - s;
        return p;
        
    }
}