public class _18_LongestPalindrome {
    public static String findLongestPalindromicSubstring(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0, end = 0;
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            // Expand for odd-length palindrome
            int len1 = expandAroundCenter(s, i, i);
            // Expand for even-length palindrome
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);

            // Update only if a longer palindrome is found
            if (len > maxLength) {
                maxLength = len;
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        String text = "noonlevelacivicas";
        System.out.println("Longest Palindromic Substring: " + findLongestPalindromicSubstring(text));

        text = "cbbd";
        System.out.println("Longest Palindromic Substring: " + findLongestPalindromicSubstring(text));

        text = "abcbaabbcba";
        System.out.println("Longest Palindromic Substring: " + findLongestPalindromicSubstring(text));
    }
}
