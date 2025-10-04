public class _345_Revers_Vowels_of_a_String {
    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));
        System.out.println(reverseVowels("leetcode"));
    }

    private static String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] sToChar = s.toCharArray();

        while (left < right) {
            if (isVovel(sToChar[left]) && !isVovel(sToChar[right])) {
                right--;
            } else if (!isVovel(sToChar[left]) && isVovel(sToChar[right])) {
                left++;
            } else if (isVovel(sToChar[left]) && isVovel(sToChar[right])) {
                char temp = sToChar[left];
                sToChar[left] = sToChar[right];
                sToChar[right] = temp;
                left++;
                right--;
            } else {
                left++;
                right--;
            }
        }

        return new String(sToChar);
    }

    private static boolean isVovel(char s) {
        if (s == 'a' || s == 'A' || s == 'e' || s == 'E' || s == 'i' || s == 'I' || s == 'o' || s == 'O' || s == 'u'
                || s == 'U') {
            return true;
        } else {
            return false;
        }
    }
}
