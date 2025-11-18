class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";

        String str = "1";

        for (int i = 2; i <= n; i++) {
            StringBuilder temp = new StringBuilder();
            int count = 1;

            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(j - 1)) {
                    count++;
                } else {
                    temp.append(count).append(str.charAt(j - 1));
                    count = 1;
                }
            }

            // Append last counted group
            temp.append(count).append(str.charAt(str.length() - 1));

            str = temp.toString();
        }

        return str;
    }
}
