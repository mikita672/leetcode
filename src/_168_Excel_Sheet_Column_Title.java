public class _168_Excel_Sheet_Column_Title {
    public static void main(String[] args) {
        System.out.println(ConvertToTitle(1));
        System.out.println(ConvertToTitle(28));
    }

    private static String ConvertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            result.append((char) ('A' + columnNumber % 26));
            columnNumber /= 26;
        }

        return result.reverse().toString();
    }
}
