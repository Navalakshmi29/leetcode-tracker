// Last updated: 08/07/2026, 21:43:22
import java.util.*;

class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        Map<Character, Queue<String>> buckets = new HashMap<>();

        // Step 1: Put each word in a queue based on its first character
        for (String word : words) {
            char firstChar = word.charAt(0);
            buckets.computeIfAbsent(firstChar, k -> new LinkedList<>()).add(word);
        }

        int count = 0;

        // Step 2: Process each character in s
        for (char c : s.toCharArray()) {
            Queue<String> queue = buckets.getOrDefault(c, new LinkedList<>());
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String word = queue.poll();
                if (word.length() == 1) {
                    count++; // Fully matched word
                } else {
                    String next = word.substring(1);
                    char nextChar = next.charAt(0);
                    buckets.computeIfAbsent(nextChar, k -> new LinkedList<>()).add(next);
                }
            }
        }

        return count;
    }
}
