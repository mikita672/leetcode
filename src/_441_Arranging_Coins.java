public class _441_Arranging_Coins {
    public static void main(String[] args) {

    }

    public static int arrangeCoins(int n) {
        int i = 1;
        while (n > 0) {
            i++;
            n = n - i;
        }

        return i - 1;
    }
}
