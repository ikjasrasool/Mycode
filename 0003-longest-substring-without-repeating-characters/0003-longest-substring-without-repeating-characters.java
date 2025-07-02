class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++)
        {
            Set<Character> c=new HashSet<>();
            int j=i;
            while(j<s.length()&&!c.contains(s.charAt(j)))
            {
                c.add(s.charAt(j));
                j++;
            }
            max=Math.max(max,j-i);
        }
        return max;
    }
}