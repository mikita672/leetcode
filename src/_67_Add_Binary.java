public class _67_Add_Binary {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {
        int a_cursor = a.length() - 1;
        int b_cursor = b.length() - 1;
        int result_cursor = Math.max(a.length(), b.length()) - 1;
        char[] result = new char[result_cursor + 1];
        boolean carry_bit = false;


        for (; a_cursor != -1 && b_cursor != -1; a_cursor--, b_cursor--, result_cursor--) {
            if (a.charAt(a_cursor) == '0' && b.charAt(b_cursor) == '0') {
                if (carry_bit) {
                    result[result_cursor] = '1';
                    carry_bit = false;
                } else {
                    result[result_cursor] = '0';
                }
            } else if (a.charAt(a_cursor) == '1' && b.charAt(b_cursor) == '1') {
                if (carry_bit) {
                    result[result_cursor] = '1';
                } else {
                    result[result_cursor] = '0';
                    carry_bit = true;
                }
            } else {
                if (carry_bit) {
                    result[result_cursor] = '0';
                } else {
                    result[result_cursor] = '1';
                }
            }
        }

        for (; a_cursor != -1; a_cursor--, result_cursor--) {
            if (carry_bit && a.charAt(a_cursor) == '1') {
                result[result_cursor] = '0';
            } else if (carry_bit && a.charAt(a_cursor) == '0') {
                result[result_cursor] = '1';
                carry_bit = false;
            } else {
                result[result_cursor] = a.charAt(a_cursor);
            }
        }

        for (; b_cursor != -1; b_cursor--, result_cursor--) {
            if (carry_bit && b.charAt(b_cursor) == '1') {
                result[result_cursor] = '0';
            } else if (carry_bit && b.charAt(b_cursor) == '0') {
                result[result_cursor] = '1';
                carry_bit = false;
            } else {
                result[result_cursor] = b.charAt(b_cursor);
            }
        }

        String result_string = new String(result);

        if (carry_bit) {
            result_string = '1' + result_string;
        }

        return result_string;
    }
}
