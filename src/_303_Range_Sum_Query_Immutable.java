public class _303_Range_Sum_Query_Immutable {
    public static void main(String[] args) {
        int[] nums = { -2, 0, 3, -5, 2, -1 };

        NumArray obj = new NumArray(nums);
        System.out.println(obj.sumRange(0, 2));
        System.out.println(obj.sumRange(2, 5));
        System.out.println(obj.sumRange(0, 5));
    }
}

class NumArray {
        private static int[] prefix;

        public NumArray(int[] nums) {
            int n = nums.length;
            prefix = new int[n + 1];
            for (int i = 0; i < n; i++) {
                prefix[i + 1] = prefix[i] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            return prefix[right + 1] - prefix[left];
        }
}