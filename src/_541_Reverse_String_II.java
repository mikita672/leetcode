public class _541_Reverse_String_II {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
        System.out.println(reverseStr("abcd", 2));
    }

    public static String reverseStr(String s, int k) {
        char[] str = s.toCharArray();
        int n = s.length();

        for (int i = 0; i < n; i += 2 * k) {
            if (i + k - 1 <= n - 1) {
                reverseK(i, i + k - 1, str);
            } else {
                reverseK(i, n - 1, str);
            }
        }

        String revStr = new String(str);
        return revStr;
    }

    public static void reverseK(int i, int j, char[] str) {
        while (i < j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
    }
}
