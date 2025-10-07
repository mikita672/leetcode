import java.util.HashMap;
import java.util.Map;

public class _387_First_Unique_Character_in_a_String {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcoe"));
        System.out.println(firstUniqChar("Mikita"));
    }

    private static int firstUniqChar(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
