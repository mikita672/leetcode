import java.util.HashSet;
import java.util.Set;

public class _202_Happy_Number {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
    }

    private static boolean isHappy(int n) {
        Set<Integer> record = new HashSet<>();

        while (n != 1 && !record.contains(n)) {
            record.add(n);
            n = sum(n);
        }

        return n == 1;
    }

    private static int sum(int n) {
        int sum = 0;

        while (n > 0) {
            int LastDigit = n % 10;
            sum += LastDigit * LastDigit;
            n = n / 10;
        }

        return sum;
    }
}
