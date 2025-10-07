public class _389_Find_the_Difference {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
        System.out.println(findTheDifference("", "y"));
        System.out.println(findTheDifference("a", "aa"));
    }

    private static char findTheDifference(String s, String t) {
        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            if (--count[c - 'a'] < 0) {
                return c;
            }
        }

        return '\0';
    }
}
