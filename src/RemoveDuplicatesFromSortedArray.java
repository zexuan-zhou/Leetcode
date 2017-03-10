/**
 * Created by Zexuan on 2017/2/21.
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums){
        int count = nums.length > 0 ? 1 : 0;
        for(int n : nums) {
            if (n > nums[count - 1]) {
                nums[count] = n;
                count ++;
            }
        }
        return count;
    }
}
