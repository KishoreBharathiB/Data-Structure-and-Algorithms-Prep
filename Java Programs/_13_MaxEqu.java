public class _13_MaxEqu {
    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 8, 2, 7}; 
        int maxSum = getMax(arr);
        System.out.println(maxSum);
    }
    
    public static int getMax(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;
        int maxSum = -1; // Default value if no equilibrium index is found

        // Calculate total sum of the array
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        // Iterate and calculate left sum and right sum
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i]; // totalSum now represents the right sum

            if (leftSum == totalSum) { // Check equilibrium condition
                maxSum = Math.max(maxSum, leftSum); // Update maxSum if condition is met
            }

            leftSum += arr[i]; // Update left sum
        }

        return maxSum;
    }
}
