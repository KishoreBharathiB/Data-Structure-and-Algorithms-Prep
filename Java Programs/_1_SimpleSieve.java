public class _1_SimpleSieve {
    public static void main(String[] args) {
        simpleSieve(50);
    }

    public static void simpleSieve(int limit) {
        boolean[] prime = new boolean[limit + 1];

        for(int i = 2; i <= limit; i++) {
            prime[i] = true; 
        }

        // Optimize by starting with 2 separately since it's the only even prime
        if (limit >= 2) {
            for (int i = 4; i <= limit; i += 2) {
                prime[i] = false;
            }
        }
        
        // Now we only need to check odd numbers starting from 3
        for (int p = 3; p * p <= limit; p += 2) {
            if (prime[p]) {
                // Start from p*p and increment by 2*p to skip even multiples
                for (int i = p * p; i <= limit; i += 2 * p) {
                    prime[i] = false;
                }
            }
        }

        for(int p = 2; p <= limit; p++) {
            if(prime[p] == true) {
                System.out.println(p + " ");
            }
        }
    }
}