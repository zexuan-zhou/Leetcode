/**
 * Created by Zexuan on 2017/2/26.
 */

/*[1,3,5,6], 5 → 2
  [1,3,5,6], 2 → 1
  [1,3,5,6], 7 → 4
  [1,3,5,6], 0 → 0
  */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
            if (nums[i] > target) return Math.max(i, 0);
        }
        return nums.length;
    }
}
