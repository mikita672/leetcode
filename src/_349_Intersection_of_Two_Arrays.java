import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _349_Intersection_of_Two_Arrays {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> list = new HashSet<>();
        for (int n : nums1) {
            set.add(n);
        }
        for (int n : nums2) {
            if (set.contains(n)) {
                list.add(n);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
