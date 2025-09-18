public class _125_Valid_Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }

    private static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        for(int j = s.length() - 1, i = 0; j >= 0; j--, i++){
            if(s.charAt(j) != s.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
