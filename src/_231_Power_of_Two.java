public class _231_Power_of_Two {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(4));
        System.out.println(isPowerOfTwo(3));
        System.out.println(isPowerOfTwo(5));
    }

    private static boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }

        double dn = (double) n;

        while (Math.round(dn) > 2) {
            dn /= 2;
        }

        if (dn != 2) {
            return false;
        }

        return true;
    }
}
