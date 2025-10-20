public class _507_Perfect_Number {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
        System.out.println(checkPerfectNumber(7));
    }

    public static boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }
        int divisorsSum = 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                divisorsSum += i;
            }
        }

        return divisorsSum == num;
    }
}
