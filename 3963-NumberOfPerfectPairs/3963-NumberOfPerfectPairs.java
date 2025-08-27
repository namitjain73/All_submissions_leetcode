// Last updated: 8/28/2025, 2:45:26 AM
import java.util.*;

public class Solution {
    public long perfectPairs(int[] nums) {
        int n = nums.length;
        long[] vals = new long[n];

        // take absolute values
        for (int i = 0; i < n; i++) {
            vals[i] = Math.abs((long) nums[i]);
        }

        Arrays.sort(vals);

        long count = 0;
        int right = 0;

        for (int left = 0; left < n; left++) {
            if (right <= left) right = left + 1;

            while (right < n && vals[right] <= 2L * vals[left]) {
                right++;
            }
            count += (right - left - 1);
        }

        return count;
    }


}