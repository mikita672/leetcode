public class _136_Single_Number {
    public static void main(String[] args) {
        int [] nums1 = {2, 2, 1};
        int [] nums2 = {4,1,2,1,2};
        int [] nums3 = {1};

        System.out.println(singleNumber(nums1));
        System.out.println(singleNumber(nums2));
        System.out.println(singleNumber(nums3));
    }

    private static int singleNumber(int[] nums) {
        int prev_number = nums[0];

        for(int i = 1; i < nums.length; i++){
            prev_number = prev_number ^ nums[i];
        }
        return prev_number;
    }
}
