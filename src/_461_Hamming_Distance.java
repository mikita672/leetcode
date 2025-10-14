public class _461_Hamming_Distance {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }

    public static int hammingDistance(int x, int y) {
        int ham = x ^ y;
        return Integer.bitCount(ham);
    }
}
