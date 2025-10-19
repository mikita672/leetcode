public class _504_Base_7 {
    public static void main(String[] args) {
        
    }

    public static String convertToBase7(int num) {
        if(num == 0){
            return "0";
        }

        boolean isNegative = num < 0;
        num = Math.abs(num);
        StringBuilder sb = new StringBuilder();

        while(num > 0){
            int reminder = 0;
            reminder = num%7;
            sb.append(reminder);
            num /= 7;
        }
        if(isNegative) sb.append("-");
        return sb.reverse().toString();
    }
}
