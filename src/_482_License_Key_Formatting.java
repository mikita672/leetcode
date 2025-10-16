public class _482_License_Key_Formatting {
    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("5F3Z-2e-9-w", 4));
    }

    public static String licenseKeyFormatting(String s, int k) {
        String cleaned = s.replace("-", "").toUpperCase();

        StringBuilder sb = new StringBuilder(cleaned);

        for (int i = sb.length() - k; i > 0; i -= k) {
            sb.insert(i, "-");
        }
        return sb.toString();
    }
}
