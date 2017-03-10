/**
 * Created by Zexuan on 2017/2/20.
 */
public class MoveZeroes {
    public void moveZeros(int[] nums) {
        int insertIndex = 0;
        for(int num : nums) {
            if (num != 0) {
                nums[insertIndex++] = num;
            }
        }
        while (insertIndex < nums.length) {
            nums[insertIndex++] = 0;
        }
    }
}
