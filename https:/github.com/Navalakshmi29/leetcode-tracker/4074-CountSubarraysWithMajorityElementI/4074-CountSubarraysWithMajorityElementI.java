// Last updated: 08/07/2026, 21:40:16
class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {

        int n = nums.length;
        int ans = 0;

        // Choose the starting index
        for (int i = 0; i < n; i++) {

            int targetCount = 0;

            // Extend the subarray to the right
            for (int j = i; j < n; j++) {

                // Count target occurrences
                if (nums[j] == target) {
                    targetCount++;
                }

                // Length of current subarray
                int length = j - i + 1;

                // Check if target is majority
                if (targetCount > length / 2) {
                    ans++;
                }
            }
        }

        return ans;
    }
}