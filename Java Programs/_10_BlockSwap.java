public class _10_BlockSwap {
    public static void main(String[] args) {
        int arr[] = {7,9,9,3,5,1,5};
        leftRotate(arr, 6, 7);
        print(arr);
    }

    public static void print(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void swap(int arr[], int fi, int si, int d) {
        int i, temp;
        for(i = 0 ; i < d; i++) {
            temp = arr[fi + i];
            arr[fi + i] = arr[si + i];
            arr[si + i] = temp;
        }
    }

    public static void leftRotate(int arr[], int d, int n) {
        int i, j;

        if(d == 0 || d == n) {
            return;
        }

        if(d > n) {
            d = d % n;
        }

        i = d;
        j = n - d;

        while(i != j) {
            if(i < j) {
                swap(arr, d - i, d + j - i, i);
                j -= i;
            } else {
                swap(arr, d - i, d, j);
                i -= j;
            }
        }
        swap(arr, d - i, d, i);
    }
}
