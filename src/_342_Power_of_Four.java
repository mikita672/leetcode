public class _342_Power_of_Four {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
        System.out.println(isPowerOfFour(32));
        System.out.println(isPowerOfFour(64));
        System.out.println(isPowerOfFour(16384));
        System.out.println(isPowerOfFour(1048576));
    }

    private static boolean isPowerOfFour(int n) {
        return (n & (n - 1)) == 0 && n % 3 == 1;
    }
}
