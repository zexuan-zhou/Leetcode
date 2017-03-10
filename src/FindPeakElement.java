/**
 * Created by Zexuan on 2017/3/2.
 */
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) return 1;
        int start = 1;
        int end = nums.length - 2;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[mid - 1]) {
                end = mid;
            }
            else if (nums[mid] < nums[mid + 1]) {
                start = mid;
            }
            else {
                start = mid;
            }
        }
        if (nums[start] > nums[end]) {
            return start;
        }
        return end;
    }
}
