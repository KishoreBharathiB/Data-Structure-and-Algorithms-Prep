public class _24_Maneuvering {
    public static void main(String[] args) {
        System.out.println(no_of_path(3, 3));
    }

    public static int no_of_path(int m, int n) {
        if(n == 1 || m == 1) {
            return 1;
        }

        return no_of_path(m - 1, n)+no_of_path(m, n - 1);
    }
}