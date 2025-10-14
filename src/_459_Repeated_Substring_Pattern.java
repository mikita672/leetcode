public class _459_Repeated_Substring_Pattern {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abab"));
    }

    public static boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0 && s.substring(0, i).repeat(n / i).equals(s)) {
                return true;
            }
        }
        return false;
    }
}
