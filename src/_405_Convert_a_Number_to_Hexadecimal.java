public class _405_Convert_a_Number_to_Hexadecimal {
    public static void main(String[] args) {
        System.out.println(toHex(26));
        System.out.println(toHex(-1));
    }

    private static String toHex(int num) {
        if (num == 0) {
            return "0";
        }

        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();

        while (num != 0) {
            int rem = num & 15;
            sb.append(hexChars[rem]);
            num >>>= 4;
        }

        return sb.reverse().toString();
    }
}
