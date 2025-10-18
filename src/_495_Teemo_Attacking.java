public class _495_Teemo_Attacking {
    public static void main(String[] args) {
        System.out.println(findPoisonedDuration(new int[] { 1, 4 }, 2));
    }

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0;

        for (int i = 0; i < timeSeries.length - 1; i++) {
            if (timeSeries[i + 1] <= timeSeries[i] + duration - 1) {
                total += timeSeries[i + 1] - timeSeries[i];
            } else {
                total += duration;
            }
        }
        total += duration;
        return total;
    }
}
