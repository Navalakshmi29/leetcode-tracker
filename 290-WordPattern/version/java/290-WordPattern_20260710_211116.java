// Last updated: 10/07/2026, 21:11:16
1class Solution {
2    public boolean wordPattern(String pattern, String s) {
3
4        String[] words = s.split(" ");
5
6        if (pattern.length() != words.length)
7            return false;
8
9        HashMap<Character, String> map1 = new HashMap<>();
10        HashMap<String, Character> map2 = new HashMap<>();
11
12        for (int i = 0; i < pattern.length(); i++) {
13            char ch = pattern.charAt(i);
14            String word = words[i];
15
16            if (map1.containsKey(ch)) {
17                if (!map1.get(ch).equals(word))
18                    return false;
19            } else {
20                map1.put(ch, word);
21            }
22
23            if (map2.containsKey(word)) {
24                if (map2.get(word) != ch)
25                    return false;
26            } else {
27                map2.put(word, ch);
28            }
29        }
30
31        return true;
32    }
33}