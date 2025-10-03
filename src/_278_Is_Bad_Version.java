public class _278_Is_Bad_Version {
    public static void main(String[] args) {

    }

    public int firstBadVersion(int n) {
        int l = 0, h = n;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (isBadVersion(mid)) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    private boolean isBadVersion(int mid) {
        throw new UnsupportedOperationException("Unimplemented method 'isBadVersion'");
    }
}
