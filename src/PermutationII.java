import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Zexuan on 2017/3/4.
 */
public class PermutationII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        // write your code here
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums == null) {
            return result;
        }

        if (nums.length == 0) {
            result.add(new ArrayList<Integer>());
            return result;
        }

        int[] visited = new int[nums.length];
        for (int i = 0; i < visited.length - 1; i++) {
            visited[i] = 0;
        }

        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<Integer>();
        permuteHelper(result, list, visited, nums);
        return result;
    }

    private void permuteHelper(ArrayList<List<Integer>> result,
                               ArrayList<Integer> list,
                               int[] visited,
                               int[] nums) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<Integer>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == 1 || (i != 0 && nums[i] == nums[i - 1] && visited[i - 1] == 0)) {
                continue;
            }
            visited[i] = 1;
            list.add(nums[i]);
            permuteHelper(result, list, visited, nums);
            list.remove(list.size() - 1);
            visited[i] = 0;
        }
    }
}
