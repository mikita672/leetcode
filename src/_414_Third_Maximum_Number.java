import java.util.HashSet;

public class _414_Third_Maximum_Number {
    public static void main(String[] args) {
        System.out.println(thirdMax(new int[] { 3, 2, 1 }));
        System.out.println(thirdMax(new int[] { 1, 2 }));
        System.out.println(thirdMax(new int[] { 2, 2, 3, 1 }));
    }

    public static int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (i == max1 || i == max2 || i == max3)
                continue;
            set.add(i);

            if (i > max1) {
                max3 = max2;
                max2 = max1;
                max1 = i;
            } else if (i > max2) {
                max3 = max2;
                max2 = i;
            } else if (i > max3) {
                max3 = i;
            }
        }
        return (max3 == Long.MIN_VALUE) ? (int) max1 : (int) max3;
    }
}
