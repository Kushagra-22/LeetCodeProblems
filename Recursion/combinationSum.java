import java.util.ArrayList;
import java.util.List;

public class combinationSum {

    public static List<List<Integer>> CombinationSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        helper(arr, 0, target, list, ans);
        System.out.println(ans);
        return ans;
    }

    public static void helper(int[] arr, int index, int target, List<Integer> list, List<List<Integer>> ans) {

        if (index == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(list));

            }

            return;
        }
        if (arr[index] <= target) {
            list.add(arr[index]);

            helper(arr, index, target - arr[index], list, ans);
            list.remove(list.size() - 1);

        }

        helper(arr, index + 1, target, list, ans);
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 6, 7 };
        int target = 7;
        CombinationSum(nums, target);
    }
}
