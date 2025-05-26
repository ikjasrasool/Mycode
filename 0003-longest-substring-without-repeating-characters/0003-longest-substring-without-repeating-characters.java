class Solution {
    public int lengthOfLongestSubstring(String s) {
        int lon_sub = 0;
        int start = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);

            // If character is already seen, update start
            if (map.containsKey(ch)) {
                // Only move start forward (never backward)
                start = Math.max(start, map.get(ch) + 1);
            }

            // Put/update current character index
            map.put(ch, end);

            // Calculate max length
            lon_sub = Math.max(lon_sub, end - start + 1);
        }

        return lon_sub;
    }
}