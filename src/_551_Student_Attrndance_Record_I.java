public class _551_Student_Attrndance_Record_I {
    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLP"));
        System.out.println(checkRecord("PPALLL"));
    }

    public static boolean checkRecord(String s) {
        int a = 0;
        char arr[] = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'A') {
                a++;
            } else if (arr[i] == 'L') {
                int c = 1;
                if ((i + 1) < arr.length && arr[i + 1] == 'L') {
                    c++;
                }
                if ((i + 2) < arr.length && arr[i + 2] == 'L') {
                    c++;
                }
                if (c >= 3) {
                    return false;
                }
            }
            if (a >= 2) {
                return false;
            }
        }
        return true;
    }
}
