public class _268_Missing_Number {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[] { 3, 0, 1 }));
        System.out.println(missingNumber(new int[] { 0, 1 }));
        System.out.println(missingNumber(new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 }));
    }

    private static int missingNumber(int[] nums) {
        int expectedSum = 0;
        for (int i = 1; i <= nums.length; i++) {
            expectedSum += i;
        }

        int actualSum = 0;

        for (int n : nums) {
            actualSum += n;
        }

        return expectedSum - actualSum;
    }
}