// Last updated: 08/07/2026, 21:40:49
import java.util.*;

class Solution {
    public long minimumCost(int[] nums, int k, int dist) {
        int n = nums.length;
        long ans = Long.MAX_VALUE;

        TreeMap<Integer, Integer> small = new TreeMap<>();
        TreeMap<Integer, Integer> large = new TreeMap<>();

        long sumSmall = 0;
        int cntSmall = 0;

        for (int i = 1; i <= dist + 1 && i < n; i++) {
            add(large, nums[i]);
        }

        while (cntSmall < k - 1 && !large.isEmpty()) {
            int x = large.firstKey();
            remove(large, x);
            add(small, x);
            sumSmall += x;
            cntSmall++;
        }

        ans = nums[0] + sumSmall;

        for (int r = dist + 2; r < n; r++) {
            int out = nums[r - dist - 1];

            if (small.containsKey(out)) {
                remove(small, out);
                sumSmall -= out;
                cntSmall--;

                if (!large.isEmpty()) {
                    int x = large.firstKey();
                    remove(large, x);
                    add(small, x);
                    sumSmall += x;
                    cntSmall++;
                }
            } else {
                remove(large, out);
            }

            int in = nums[r];

            if (!small.isEmpty() && in < small.lastKey()) {
                add(small, in);
                sumSmall += in;
                cntSmall++;

                int x = small.lastKey();
                remove(small, x);
                sumSmall -= x;
                cntSmall--;

                add(large, x);
            } else {
                add(large, in);
            }

            while (cntSmall < k - 1 && !large.isEmpty()) {
                int x = large.firstKey();
                remove(large, x);
                add(small, x);
                sumSmall += x;
                cntSmall++;
            }

            while (cntSmall > k - 1) {
                int x = small.lastKey();
                remove(small, x);
                sumSmall -= x;
                cntSmall--;
                add(large, x);
            }

            ans = Math.min(ans, nums[0] + sumSmall);
        }

        return ans;
    }

    private void add(TreeMap<Integer, Integer> map, int x) {
        map.put(x, map.getOrDefault(x, 0) + 1);
    }

    private void remove(TreeMap<Integer, Integer> map, int x) {
        int cnt = map.get(x);
        if (cnt == 1) {
            map.remove(x);
        } else {
            map.put(x, cnt - 1);
        }
    }
}