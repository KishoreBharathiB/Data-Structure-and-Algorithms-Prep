import java.util.Scanner;

public class _9_SwapNibbles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an 8-bit binary string:");
        String binaryInput = scanner.nextLine();

        // Validate input
        // if (binaryInput.length() != 8 || !binaryInput.matches("[01]+")) {
        //     System.out.println("Invalid input! Please enter an 8-bit binary string.");
        //     scanner.close();
        //     return;
        // }

        // Convert binary string to byte and swap nibbles
        int value = Integer.parseInt(binaryInput, 2);
        int swapped = ((value & 0x0F) << 4) | ((value & 0xF0) >>> 4);

        // Print original and swapped binary strings
        System.out.println("Original binary: " + binaryInput);
        System.out.println("Swapped binary: " + String.format("%8s", Integer.toBinaryString(swapped)).replace(' ', '0'));
        scanner.close();
    }
}
