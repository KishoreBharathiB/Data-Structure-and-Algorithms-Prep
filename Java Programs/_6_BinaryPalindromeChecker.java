import java.util.*;

public class _6_BinaryPalindromeChecker {
    public static boolean isBinaryPalindrome(int x) {
        if (x == 0) return true;
        int msb = 31 - Integer.numberOfLeadingZeros(x);
        for (int i = 0; i <= msb/2; i++)
            if (((x >> i) & 1) != ((x >> (msb - i)) & 1)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (isBinaryPalindrome(x)) {
            System.out.println(x + " has a binary palindrome representation.");
        } else {
            System.out.println(x + " does not have a binary palindrome representation.");
        }
        sc.close();
    }
}
