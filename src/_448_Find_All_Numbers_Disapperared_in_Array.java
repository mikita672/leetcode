import java.util.ArrayList;
import java.util.List;

public class _448_Find_All_Numbers_Disapperared_in_Array {
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 }));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] present = new boolean[nums.length + 1];

        for (int num : nums) {
            present[num] = true;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!present[i]) {
                result.add(i);
            }
        }

        return result;
    }
}
