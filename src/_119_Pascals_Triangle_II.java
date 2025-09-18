import java.util.ArrayList;
import java.util.List;

public class _119_Pascals_Triangle_II {
    public static void main(String[] args) {
        System.out.println(getRow(3));
    }

    private static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            row.add(1);
        }

        for(int currentRow = 2; currentRow <= rowIndex; currentRow++){
            for(int position = currentRow - 1; position > 0; position--){
                row.set(position, row.get(position) + row.get(position - 1));
            }
        }

        return row;
    }
}
