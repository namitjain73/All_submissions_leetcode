// Last updated: 8/28/2025, 2:46:30 AM
class Solution {
    public int maximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;
        for(int i : nums){
            if(i < 0) neg++;
            else if(i > 0) pos++;
        }

        return Math.max(neg , pos);
        
    }
}