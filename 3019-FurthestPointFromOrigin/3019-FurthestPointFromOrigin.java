// Last updated: 8/28/2025, 2:46:12 AM
class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left = 0, right = 0, underscore = 0;
        
        for (char move : moves.toCharArray()) {
            if (move == 'L') left++;
            else if (move == 'R') right++;
            else underscore++;
        }
        return Math.abs(left - right) + underscore;
    }
}