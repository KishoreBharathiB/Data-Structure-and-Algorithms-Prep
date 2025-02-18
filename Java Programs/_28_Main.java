public class _28_Main {
    public static void main(String[] args) {
        String s = "mmaakkssh"; 
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder half = new StringBuilder();
        StringBuilder oddChar = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                oddChar.append((char) (i + 'a'));
                freq[i]--;
            }
            for (int j = 0; j < freq[i] / 2; j++) {
                half.append((char) (i + 'a'));
            }
        }

        if (oddChar.length() > 1) {
            System.out.println("No palindromic string");
            return;
        }

        StringBuilder palindrome = new StringBuilder(half);
        if (oddChar.length() > 0) {
            palindrome.append(oddChar);
        }
        palindrome.append(half.reverse());

        System.out.println(palindrome);
    }
}
