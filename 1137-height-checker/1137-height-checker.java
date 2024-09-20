class Solution {
    public int heightChecker(int[] heights) {
        int[] v = heights.clone();
        // int[] v = Arrays.copyOf(heights, heights.length);
        int cnt = 0;
        Arrays.sort(v);
        for (int i = 0; i < v.length; i++) {
            if (heights[i] != v[i]) {
                cnt++;
            }
        }

        return cnt;
    }
}