
public class _374_Guess_Number_Higher_or_Lower {

    public static void main(String[] args) {

    }

    private static int guess(int num) {
        return num;
    }

    @SuppressWarnings("unused")
    private static int guessNumber(int n) {
        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int res = guess(mid);
            if (res == 0) {
                return mid;
            }
            if (res < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
