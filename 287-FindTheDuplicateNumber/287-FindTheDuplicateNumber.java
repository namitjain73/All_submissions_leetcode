// Last updated: 8/28/2025, 2:50:37 AM
class Solution {
    public int findDuplicate(int[] nums) {
        int slow= 0;
        int fast = 0;
        while(true){
            slow= nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast){
                break;
            }
        }
        int slow2 = 0;

        while(true){
            slow = nums[slow];
            slow2 = nums[slow2];
            if(slow == slow2) break;
        }

        return slow;
        
    }
}