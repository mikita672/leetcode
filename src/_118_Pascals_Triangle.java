import java.util.ArrayList;
import java.util.List;

public class _118_Pascals_Triangle {
    public static void main(String[] args) {
        System.out.println(generate(1));
        System.out.println(generate(2));
        System.out.println(generate(5));
    }

    private static List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return null;

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        if (numRows == 1) return result;

        List<Integer> secondRow = new ArrayList<>();
        secondRow.add(1);
        secondRow.add(1);
        result.add(secondRow);
        if (numRows == 2) return result;

        for (int cursor = 3; cursor <= numRows; cursor++) {
            List<Integer> newRow = new ArrayList<>();

            for (int i = 0; i < cursor; i++) {
                if (i == 0 || i == cursor - 1) {
                    newRow.add(1);
                } else {
                    newRow.add(result.get(cursor - 2).get(i - 1) + result.get(cursor - 2).get(i));
                }
            }

            result.add(newRow);
        }

        return result;
    }
}
