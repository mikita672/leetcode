public class _9_Palindrome_Number {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }

    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        StringBuilder intToString = new StringBuilder(String.valueOf(x));
        StringBuilder reversedInt = new StringBuilder(String.valueOf(x)).reverse();
        for(int i = 0; i < intToString.length(); i++){
            if(intToString.charAt(i) != reversedInt.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
