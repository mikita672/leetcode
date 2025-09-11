public class _28_Find_the_Index_of_the_First_Occurrence_in_a_String {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
        System.out.println(strStr("leetcode", "leeto"));
        System.out.println(strStr("a", "a"));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) return -1;
        boolean valFound = false;

        for (int i = 0; i < (haystack.length() - needle.length() + 1); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                for (int j = 0; j < needle.length(); j++) {
                    valFound = true;
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        valFound = false;
                        break;
                    }
                }
                if (valFound) {
                    return i;
                }
            }
        }
        return -1;
    }
}
