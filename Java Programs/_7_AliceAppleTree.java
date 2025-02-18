import java.util.*;

public class _7_AliceAppleTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int sum = 0;
        int apple = sc.nextInt();
        while (sum < apple) {
            cnt++;
            sum += (12 * cnt * cnt);
        }
        System.out.println((8 * (cnt)));
        sc.close();
    }
}
