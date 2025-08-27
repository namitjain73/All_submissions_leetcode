// Last updated: 8/28/2025, 2:46:22 AM
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int n = 0;
        for(int x : derived){
            n ^= x;
        }

        return n == 0;
        
    }
}