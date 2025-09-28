import java.util.ArrayList;
import java.util.List;

public class _228_Summary_Ranges {
    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
        System.out.println(summaryRanges(new int[]{0,2,3,4,6,8,9}));
    }

    private static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }

        int i = 0;
        while (i < nums.length) {
            int start = nums[i];
            int j = i;

            while (j + 1 < nums.length && nums[j + 1] == nums[j] + 1) {
                j++;
            }

            if (nums[j] == start) {
                result.add(String.valueOf(start));
            } else {
                result.add(start + "->" + nums[j]);
            }

            i = j + 1;
        }
        return result;
    }
}
