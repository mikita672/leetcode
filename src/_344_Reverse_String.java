public class _344_Reverse_String {
    public static void main(String[] args) {
        char[] str1 = { 'h', 'e', 'l', 'l', 'o' };
        reverseString(str1);
        System.out.println(str1);
    }

    private static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
