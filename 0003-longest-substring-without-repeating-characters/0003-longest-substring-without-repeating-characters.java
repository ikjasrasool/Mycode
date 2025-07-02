class Solution {
    public int lengthOfLongestSubstring(String s) {
        int r=0,l=0,maxlen=0;
        Set<Character> m=new HashSet<>();
        for(r=0;r<s.length();r++)
        {
            while(m.contains(s.charAt(r)))
            {
                m.remove(s.charAt(l));
                l++;
            }
            m.add(s.charAt(r));
            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
}