import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _22_WeightedSubstring {
    public static int value[] = new int[26];

    public static void main(String[] args) {
        inv();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Character> s = new ArrayList<>();
        fore(s,n);
        scanner.close();

    }

    public static void inv() {
        int prev = 1;
        value[0] = 1;
        for(int i = 1; i<26;i++) {
            value[i] = (i+1)*prev+prev;
            prev = value[i];
        }
    }

    public static void fore(List<Character> s, int k) {
        int low = 0;
        int high = 26;

        while (k != 0) {
            int ind = floor(k, low, high);
            s.add((char)(ind+'A'));
            k -= value[ind];
        }

        for(int i = s.size()-1; i >=0; i--) {
            System.out.print(s.get(i));
        }
    }

    public static int floor(int k, int low, int high) {
        int ans = -1;
        while(low <= high) {
            int mid = (low + high)/2;
            if(value[mid] <= k) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
