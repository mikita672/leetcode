import java.util.HashMap;
import java.util.Map;

public class _205_Isomorphic_Strings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("paper", "title"));
    }

    private static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Character> sToTMap = new HashMap<>();
        Map<Character, Character> tToSMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charFromS = s.charAt(i);
            char charFromT = t.charAt(i);

            if (sToTMap.containsKey(charFromS) && sToTMap.get(charFromS) != charFromT) {
                return false;
            }

            if (tToSMap.containsKey(charFromT) && tToSMap.get(charFromT) != charFromS) {
                return false;
            }

            sToTMap.put(charFromS, charFromT);
            tToSMap.put(charFromT, charFromS);
        }

        return true;
    }
}
