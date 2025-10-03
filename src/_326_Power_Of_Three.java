public class _326_Power_Of_Three {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
        System.out.println(isPowerOfThree(-1));
        System.out.println(isPowerOfThree(0));
    }

    public static boolean isPowerOfThree(int n) {
        if (n == 0 || n <= 0) {
            return false;
        }

        return 1162261467 % n == 0;
    }
}
