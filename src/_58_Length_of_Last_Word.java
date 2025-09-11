public class _58_Length_of_Last_Word {
    public static void main(String[] args) {
        lengthOfLastWord("Hello World");
        lengthOfLastWord("   fly me   to   the moon  ");
        lengthOfLastWord("luffy is still joyboy");
    }

    public static int lengthOfLastWord(String s) {
        int lastWordIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                for (int j = i; j < s.length(); j++) {
                    if (s.charAt(j) != ' ') {
                        lastWordIndex = i + 1;
                    }
                }
            }
        }

        int length = 0;
        System.out.print("The last word is \"");
        for (int i = lastWordIndex; i < s.length(); i++) {
            if(s.charAt(i) == ' ') break;
            System.out.print(s.charAt(i));
            length++;
        }
        System.out.print("\" with length " + length + "\n");

        return length;
    }
}
