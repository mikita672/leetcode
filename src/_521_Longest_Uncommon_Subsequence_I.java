public class _521_Longest_Uncommon_Subsequence_I {
    public static void main(String[] args) {
        System.out.println(findLUSlength("aba", "cdc"));
        System.out.println(findLUSlength("aaa", "bbb"));
        System.out.println(findLUSlength("aaa", "aaa"));
    }

    public static int findLUSlength(String a, String b) {
        if (a.equals(b)) {
            return -1;
        }

        return a.length() > b.length() ? a.length() : b.length();
    }
}
