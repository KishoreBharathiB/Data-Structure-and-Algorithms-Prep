public class _21_Josephus { 
    // Recursive method to solve the Josephus problem
    public static int josephus(int n, int k) {
        if (n == 1)
            return 1;
        else
            return (josephus(n - 1, k) + k - 1) % n + 1;
    }
 
    public static void main(String[] args) {
        int n = 14; // Total number of people
        int k = 2;  // Step size
        System.out.println("The chosen place is " + josephus(n, k));
    }
}
