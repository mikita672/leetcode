import java.util.HashSet;
import java.util.Set;

public class _219_Contains_Duplicate_II {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        System.out.println(containsNearbyDuplicate(nums1, 3));
        int[] nums2 = {1, 0, 1, 1};
        System.out.println(containsNearbyDuplicate(nums2, 1));
    }

    private static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }

            if (!set.add(nums[i])) {
                return true;
            }
        }

        return false;
    }
}
