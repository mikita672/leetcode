public class _27_Remove_Element {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};

        int res = removeElement(nums, 2);
    }

    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int result = nums.length;

        for (int i = 0; ; i++) {
            if (i >= result) break;

            if (nums[i] == val) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - 1] = nums[i];
                result--;
                i--;
            }
        }
        return result;
    }
}
