public class _14_MajorityElement {
    public static void main(String[] args) {
        int[] nums = {4,3,3,3,2,3,3,2,2};
        if(findMajorityElement(nums) == -1) {
            System.out.println("no maj");
        } else {
            System.out.println(findMajorityElement(nums));
        }
    }

    public static int findMajorityElement(int[] nums) {
        int candiate = 0;
        int count = 0;

        for(int num : nums) {
            if(count == 0) {
                candiate = num;
                count = 1;
            } else if(candiate == num) {
                count++;
            } else {
                count--;
            }
        }

        int majCount = 0;

        for(int num : nums) {
            if(num == candiate) {
                majCount++;
            }
        }

        if(majCount > nums.length/2) {
            return candiate;
        }
        return -1;
    }
}
