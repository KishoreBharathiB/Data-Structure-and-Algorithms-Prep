import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _19_Permutations {
    public static void main(String[] args) {
        String input = "ABC";
        distinctPermutations(input);
    }

    public static void distinctPermutations(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars); // Sort characters to handle duplicates
        input = new String(chars);
        permute(input.toCharArray(), 0);
    }

    public static void permute(char[] chars, int index) {
        if (index == chars.length - 1) {
            System.out.println(String.valueOf(chars));
            return;
        }

        Set<Character> used = new HashSet<>();
        for (int i = index; i < chars.length; i++) {
            if (used.contains(chars[i])) {
                continue; // Skip duplicates
            }

            used.add(chars[i]);
            swap(chars, index, i); // Swap for permutation
            permute(chars, index + 1); // Recursive call
            swap(chars, index, i); // Backtrack
        }
    }

    public static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
