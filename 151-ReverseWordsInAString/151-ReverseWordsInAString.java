// Last updated: 08/07/2026, 21:47:18
class Solution {
    public String reverseWords(String s) {
        int end = s.length() - 1;
        StringBuilder sb = new StringBuilder();

        while (end >= 0) {
            // Skip trailing spaces
            while (end >= 0 && s.charAt(end) == ' ') end--;

            if (end < 0) break;

            int start = end;

            // Find the start of the word
            while (start >= 0 && s.charAt(start) != ' ') start--;

            // Append the word
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(s.substring(start + 1, end + 1));

            end = start - 1;
        }

        return sb.toString();
    }
}
