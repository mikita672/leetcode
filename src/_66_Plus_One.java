import java.util.Arrays;

public class _66_Plus_One {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(plusOne(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == 0 && digits[0] == 9) {
                int[] newDigits = new int[digits.length + 1];
                Arrays.fill(newDigits, 0);
                newDigits[0] = 1;
                return newDigits;
            }
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        return digits;
    }
}
