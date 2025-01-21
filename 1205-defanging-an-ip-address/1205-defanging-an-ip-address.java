class Solution {
    public String defangIPaddr(String address) {
        String res = ""; // Initialize result string

        // Iterate through each character in the input address
        for (int i = 0; i < address.length(); i++) {
            char ch = address.charAt(i); // Get the current character

            if (ch == '.') {
                // Replace '.' with '[.]'
                res += "[.]";
            } else {
                // Append non-period characters as-is
                res += ch;
            }
        }

        // Return the defanged IP address
        return res;
    }
}