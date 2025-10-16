public class _476_Number_Complement {
    public static void main(String[] args) {
        System.out.println(findComplement(5));
        System.out.println(findComplement(1));
    }

    public static int findComplement(int num) {
        if (num == 0) {
            return 1;
        }

        int bitLength = Integer.toBinaryString(num).length();

        int mask = (1 << bitLength) - 1;

        return num ^ mask;
    }
}
