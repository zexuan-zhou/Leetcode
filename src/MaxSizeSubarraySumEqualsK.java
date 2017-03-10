import java.util.HashMap;

/**
 * Created by Zexuan on 2017/2/20.
 */
public class MaxSizeSubarraySumEqualsK {
    public int maxSubArrayLen(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == k) {
                max = i + 1;
            }
            int diff = sum - k;
            if (map.containsKey(diff)) {
                max = Math.max(max, i - map.get(diff));
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return max;
    }
}
