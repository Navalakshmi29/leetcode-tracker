// Last updated: 08/07/2026, 21:40:42
class Solution {
    public int maximumLength(int[] nums) {
        Map<Long, Integer> freq = new HashMap<>();

        for (int x : nums) {
            freq.put((long)x, freq.getOrDefault((long)x, 0) + 1);
        }

        int ans = 1;

        // Special case for 1
        if (freq.containsKey(1L)) {
            int count = freq.get(1L);
            ans = Math.max(ans, count % 2 == 0 ? count - 1 : count);
        }

        for (long x : freq.keySet()) {
            if (x == 1) continue;

            int len = 0;
            long cur = x;

            while (freq.getOrDefault(cur, 0) >= 2) {
                len += 2;
                cur = cur * cur;
            }

            if (freq.getOrDefault(cur, 0) == 1) {
                len++;
            } else {
                len--;
            }

            ans = Math.max(ans, len);
        }

        return ans;
    }
}