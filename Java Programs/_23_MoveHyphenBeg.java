import java.util.Scanner;

public class _23_MoveHyphenBeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // Input string
        String result = moveHyphensToFront(input);
        System.out.println(result); // Output the modified string
        scanner.close();
    }

    public static String moveHyphensToFront(String str) {
        StringBuilder hyphens = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c == '-') {
                hyphens.append(c); // Add hyphens to the hyphens string
            } else {
                others.append(c); // Add other characters to the others string
            }
        }

        // Concatenate hyphens at the beginning and others after
        return hyphens.toString() + others.toString();
    }
}

