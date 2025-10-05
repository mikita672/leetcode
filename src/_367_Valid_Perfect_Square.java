public class _367_Valid_Perfect_Square {
    public static void main(String[] args) {

    }

    @SuppressWarnings("unused")
    private static boolean isPerfectSquare(int num) {
        if (num == 1)
            return true;
        int right = num / 2, left = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long pow = (long) mid * mid;
            if (pow == num)
                return true;
            else if (pow < num)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }
}
