/**
 * Created by Zexuan on 2017/3/2.
 */
public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while (start < end - 1) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                end = mid;
            }
            else {
                start = mid;
            }
        }
        if (isBadVersion(start)) {
            return start;
        }
        return end;
    }
}
