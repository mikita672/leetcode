public class _14_Longest_Common_Prefix {
    public static void main(String[] args) {
//        String[] strings = new String[]{"flower", "flow", "flight"};
//        String[] strings = new String[]{"dog","racecar","car"};
        String[] strings = new String[]{"ab", "a"};
        System.out.println(longestCommonPrefix(strings));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        int j = 0;
        boolean should_return = false;
        int max_length = strs[0].length();
        for(int i = 1; i < strs.length; i++){
           if(strs[i].length() < max_length){
               max_length = strs[i].length();
           }
        }

        for(; j < max_length; j++) {
            for (String str : strs) {
                if (str.charAt(j) != strs[0].charAt(j)) {
                    should_return = true;
                    break;
                }
            }
            if(should_return){
                return result.toString();
            }
            result.append(strs[0].charAt(j));
        }
        return result.toString();
    }
}
