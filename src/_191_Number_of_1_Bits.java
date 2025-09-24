public class _191_Number_of_1_Bits {
    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
        System.out.println(hammingWeight(128));
        System.out.println(hammingWeight(2147483645));
    }

    private static int hammingWeight(int n) {
        int result = 0;

        while (n != 0) {
            result += n & 1;

            n >>>= 1;
        }

        return result;
    }
}
