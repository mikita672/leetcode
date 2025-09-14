public class _70_Climbing_Stairs {
    public static void main(String[] args) {

    }

    public static int climbStairs(int n) {
        // f(i-2), init: 0 ways to reach step -1
        int previousTwo = 0;
        // f(i-1), init : 1 way to reach step 0
        int previousOne = 1;

        for(int step = 0; step < n; step++){
            int current = previousTwo+previousOne;

            previousTwo = previousOne;
            previousOne = current;
        }

        return previousOne;
    }
}
