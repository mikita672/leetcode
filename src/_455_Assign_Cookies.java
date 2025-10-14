import java.util.Arrays;

public class _455_Assign_Cookies {
    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[] { 1, 2, 3 }, new int[] { 1, 1 }));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        for (int j = 0; i < g.length && j < s.length; j++) {
            if (g[i] <= s[j])
                i++;
        }
        return i;
    }
}
