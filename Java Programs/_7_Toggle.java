import java.util.*;

public class _7_Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean b[] = new boolean[n + 1];
        int i, j, c = 0, o = 0;

        // for (i = 1; i <= n; i++) {
        //     for (j = i; j * i <= n; j++) {
        //         if (b[j] == false) {
        //             b[j] = true;
        //         } else {
        //             b[j] = false;
        //         }
        //     }
        // }
        
        for ( i = 1; i <= n; i++) {
            for ( j = i; j <= n; j += i) {
                b[j] = !b[j]; // Toggle the door
            }
        }

        for (i = 1; i <= n; i++) {
            if (b[i] == true) {
                c++;
            } else {
                o++;
            }
        }

        System.out.println("No Of Doors open: " + c);
        System.out.println("No Of Doors closed: " + o);
    }
}
