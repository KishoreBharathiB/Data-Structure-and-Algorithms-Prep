public class _8_LongestSequence1 {
    public static void main(String[] args) {
        int num = 56825;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(logestSequenceOfOnes(num));
    }

    public static int logestSequenceOfOnes(int binaryNumber) {
        String binaryString = Integer.toBinaryString(binaryNumber);
        int count = 0;
        int maxcount = 0;

        for(char digit : binaryString.toCharArray()) {
            if(digit == '1') {
                count++;
                if(count > maxcount) {
                    maxcount = count;
                }
            } else {
                count = 0;
            }
        }
        return maxcount;
    }
}
