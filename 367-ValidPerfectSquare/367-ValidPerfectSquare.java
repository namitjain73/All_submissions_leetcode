// Last updated: 8/28/2025, 2:50:20 AM
class Solution {
    public boolean isPerfectSquare(int num) {
        return check(num);
        
    }

    public static boolean check(int n){
        int lo = 0;
        int hi = n;
        while(lo <= hi){
            long mid = lo +(hi - lo)/2 ;
            if(mid * mid == n){
                return true;
            }
            else if(mid*mid < n){
                lo = (int)mid + 1;
            }
            else{
                hi = (int)mid - 1;
            }
        }
        return false;
    }
}