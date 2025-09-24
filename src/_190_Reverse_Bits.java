public class _190_Reverse_Bits {
    public static void main(String[] args) {
        System.out.println(reverseBits(43261596));
        System.out.println(reverseBits(2147483644));
    }

    private static int reverseBits(int n) {
        int result = 0;

        for (int bitPosition = 0; bitPosition < 32 && n != 0; bitPosition++) {
            int currentBit = n & 1;

            result |= currentBit << (31 - bitPosition);

            n >>>= 1;
        }

        return result;
    }
}
