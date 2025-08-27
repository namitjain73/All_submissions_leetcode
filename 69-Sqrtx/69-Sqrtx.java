// Last updated: 8/28/2025, 2:52:20 AM
class Solution {
    public int mySqrt(int x) {
        long n =0;
        long lo = 0; 
        long hi = x;
        while(lo <= hi){
            long mid = lo +  (hi - lo)/2;
            if(mid*mid <= x){
                n = mid;
                lo = mid + 1;
            }
            else{
                hi = mid - 1;
                            }
        }

        return (int)n;
    }
}