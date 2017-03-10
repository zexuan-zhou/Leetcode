/**
 * Created by Zexuan on 2017/2/19.
 */
import java.util.HashMap;
import java.util.StringJoiner;

/**
 * Created by Zexuan on 2017/2/18.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                int[] result = { map.get(complement), i };
                return result;
            }
            map.put(nums[i], i);
        }
        return null;
    }
    public static void main(String args[]) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(nums, target);
        for (int i : result) {
            System.out.print(String.valueOf(i) + " ");
        }
    }
}


