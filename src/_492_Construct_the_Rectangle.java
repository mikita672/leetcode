import java.util.Arrays;

public class _492_Construct_the_Rectangle {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(constructRectangle(4)));
        System.out.println(Arrays.toString(constructRectangle(37)));
        System.out.println(Arrays.toString(constructRectangle(122122)));
    }

    public static int[] constructRectangle(int area) {
        int wid = (int) Math.sqrt(area);

        while (area % wid != 0) {
            wid--;
        }

        int len = area / wid;

        return new int[] { len, wid };
    }
}
