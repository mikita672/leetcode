import java.util.Arrays;

public class _283_Move_Zeros {
    public static void main(String[] args) {
        int[] nums = new int[] { 0, 1, 0, 3, 12 };
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

        int[] nums2 = new int[] { 0 };
        moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2));

        int[] nums3 = new int[] { 0, 0, 1 };
        moveZeroes(nums3);
        System.out.println(Arrays.toString(nums3));
    }

    private static void moveZeroes(int[] nums) {
        int writeIndex = 0;

        for (int readIndex = 0; readIndex < nums.length; readIndex++) {
            if (nums[readIndex] != 0) {
                nums[writeIndex] = nums[readIndex];
                writeIndex++;
            }
        }

        while (writeIndex < nums.length) {
            nums[writeIndex] = 0;
            writeIndex++;
        }
    }
}
