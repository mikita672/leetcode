public class _409_Longest_Palindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdddd"));
    }

    private static int longestPalindrome(String s) {
        int[] arr = new int[52];
        int n = s.length(), ans = 0;
        boolean hasOdd = false;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch < 'a') {
                arr[ch - 'A']++;
            } else {
                arr[ch - 'a' + 26]++;
            }
        }
        for (int i = 0; i < 52; i++) {
            if (arr[i] % 2 == 0) {
                ans += arr[i];
            } else {
                hasOdd = true;
                ans += arr[i] - 1;
            }
        }
        return hasOdd ? ans + 1 : ans;
    }
}
