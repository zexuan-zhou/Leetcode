import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zexuan on 2017/3/4.
 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        // write your code here
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums == null) {
            return result;
        }

        if (nums.length == 0) {
            result.add(new ArrayList<Integer>());
            return result;
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        permuteHelper(result, list, nums);
        return result;
    }

    private void permuteHelper(List<List<Integer>> result,
                               List<Integer> list,
                               int[] nums) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<Integer>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                continue;
            }
            list.add(nums[i]);
            permuteHelper(result, list, nums);
            list.remove(list.size() - 1);
        }
    }
}
