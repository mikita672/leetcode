import java.util.Arrays;

public class _217_Contains_Duplicate {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums1));
        int[] nums2 = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums2));
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(nums3));
    }

    private static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]){
                return true;
            }
        }

        return false;
    }
}
