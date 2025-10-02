public class _292_Nim_Game {
    public static void main(String[] args) {
        System.out.println(canWinNim(1));
        System.out.println(canWinNim(4));
    }

    private static boolean canWinNim(int n) {
        return n % 4 == 0;
    }
}
