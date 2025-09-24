public class _171_Excel_Sheet_Column_Number {
    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
    }

    private static int titleToNumber(String columnTitle) {
        int number = 0;
        for(int i = 0; i < columnTitle.length(); i++){
            number = number * 26 +((int)columnTitle.charAt(i) + 1 - 'A');
        }

        return number;
    }
}
