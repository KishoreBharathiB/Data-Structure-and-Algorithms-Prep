public class _2_SegmentedSieve {
    public static void main(String[] args) {
        prim(0, 30);
    }

    public static void prim(int low, int high) {
        if(low == 0) {
            low = 2;
        }
        for(int i = low; i <= high; i++) {
            int flag = 0;
            for(int j = 2 ; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                System.out.println(i);
            }
        }
    }
}

