public class _520_Detect_Capital {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("FlaG"));
        System.out.println(detectCapitalUse("ffffffffffffffffffffF"));
        System.out.println(detectCapitalUse("aaaaa"));
        System.out.println(detectCapitalUse("mL"));
    }

    public static boolean detectCapitalUse(String word) {
        if (word.length() == 1) {
            return true;
        }

        char[] wordArray = word.toCharArray();
        if (Character.isUpperCase(wordArray[1]) && !Character.isUpperCase(wordArray[0])) {
            return false;
        }
        boolean allCapital = false;

        if (Character.isUpperCase(wordArray[0]) && Character.isUpperCase(wordArray[1])) {
            allCapital = true;
        }

        for (int i = 2; i < wordArray.length; i++) {
            boolean isUpper = Character.isUpperCase(wordArray[i]);
            if ((!isUpper && allCapital)
                    || (isUpper && !allCapital)) {
                return false;
            }
        }

        return true;
    }
}
