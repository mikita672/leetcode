import java.util.Arrays;

public class _88_Merge_Sorted_Array {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int cursor1 = 0;
        int cursor2 = 0;
        int[] result_arr = new int[nums1.length];
        int result_cursor = 0;

        for (; cursor1 < m && cursor2 < n; result_cursor++) {
            if (nums1[cursor1] <= nums2[cursor2]) {
                result_arr[result_cursor] = nums1[cursor1];
                cursor1++;
            } else {
                result_arr[result_cursor] = nums2[cursor2];
                cursor2++;
            }
        }

        for (; cursor1 < m; cursor1++) {
            result_arr[result_cursor] = nums1[cursor1];
            result_cursor++;
        }

        for (; cursor2 < n; cursor2++) {
            result_arr[result_cursor] = nums2[cursor2];
            result_cursor++;
        }

        System.arraycopy(result_arr, 0, nums1, 0, result_arr.length);
    }
}
