/**
 * Created by Zexuan on 2017/2/21.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int count = 0;
        for (int n : nums) {
            if (n != val) {
                nums[count] = n;
                count++;
            }
        }
        return count;
    }
}
