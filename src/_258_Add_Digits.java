public class _258_Add_Digits {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
        System.out.println(addDigits(11));
        System.out.println(addDigits(5));
    }

    private static int addDigits(int num) {
        int result = 0;

        while (true) {
            while (num > 0) {
                result += num % 10;
                num /= 10;
            }

            if (result < 10) {
                return result;
            }

            num = result;
            result = 0;
        }
    }
}
