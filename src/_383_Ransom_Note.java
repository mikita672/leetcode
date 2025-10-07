public class _383_Ransom_Note {
    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));
        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("aa", "aab"));
    }

    private static boolean canConstruct(String ransomNote, String magazine) {
        int counter[] = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            counter[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            int idx = ransomNote.charAt(i) - 'a';
            if (--counter[idx] < 0) {
                return false;
            }
        }

        return true;
    }
}
