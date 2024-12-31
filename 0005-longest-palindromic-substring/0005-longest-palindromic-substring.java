class Solution {
    public static String longestPalindrome(String str) {
        String res = "";
        int len=str.length();
        while(len>0){
            for (int i = 0; i <= str.length() - len; i++) {
                if (isPalindrome(str.substring(i, i + len))) {
                    return str.substring(i, i + len);
                }
            }
            len--;
            }
            return res;
    }
    public  static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}