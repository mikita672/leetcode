public class _392_Is_Subsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbhdc"));
    }

    private static boolean isSubsequence(String s, String t) {
        int sp = 0;
        int tp = 0;

        while (sp < s.length() && tp < t.length()) {
            if (s.charAt(sp) == t.charAt(tp)) {
                sp++;
            }
            tp++;
        }

        return sp == s.length();
    }
}
