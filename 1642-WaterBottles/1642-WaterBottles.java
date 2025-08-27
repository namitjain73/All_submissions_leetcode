// Last updated: 8/28/2025, 2:47:42 AM
class Solution {
    public int numWaterBottles(int bottles, int exchange) {
        int ans = bottles;
        int emtotal = ans;

        while(bottles >= exchange){
            int i = bottles/exchange;
            bottles = bottles - i*exchange + i;

            ans += i;
        }
        return ans;
        
    }
}