import java.util.ArrayList;
import java.util.Arrays;

public class _500_Keyboard_Row {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findWords(new String[] { "Alaska", "Chuj", "alksjdf" })));
    }

    public static String[] findWords(String[] words) {
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";
        ArrayList<String> ans = new ArrayList<>();

        for (String i : words) {
            if (isInRow(i, firstRow) || isInRow(i, secondRow) || isInRow(i, thirdRow)) {
                ans.add(i);
            }
        }
        return ans.toArray(new String[0]);
    }

    private static boolean isInRow(String s, String row) {
        for (char c : s.toCharArray()) {
            if (row.indexOf(Character.toLowerCase(c)) == -1) {
                return false;
            }
        }

        return true;
    }
}
