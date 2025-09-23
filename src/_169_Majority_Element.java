import java.util.HashMap;
import java.util.Map;

public class _169_Majority_Element {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] { 1, 2, 3, 3 }));
    }

    private static int majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int len = nums.length;
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> m : freq.entrySet()) {
            if (m.getValue() > len / 2) {
                return m.getKey();
            }
        }
        return -1;
    }
}
