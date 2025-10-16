public class _485_Max_Consecutive_Ones {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[] { 1, 1, 0, 1, 1, 1 }));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int count = 0;

        for (int n : nums) {
            if (n == 0) {
                count = 0;
            } else {
                count++;
            }

            if (res < count) {
                res = count;
            }
        }
        return res;
    }
}
