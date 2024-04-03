import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum2 {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);

        helper(candidates, 0, target, list, ans);
        return ans;
    }

    public static void helper(int[] arr, int index, int target, List<Integer> list,
            List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(list));
        }

        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1])
                continue;
            if (arr[i] > target) {
                break;
            }

            list.add(arr[i]);
            helper(arr, i + 1, target - arr[i], list, ans);

            list.remove(list.size() - 1);
        }
        // helper(arr, index + 1, target, list, ans);

    }

    public static void main(String[] args) {
        int[] arr = { 10, 1, 2, 7, 6, 1, 5 };
        int target = 8;
        System.out.println(combinationSum2(arr, target));
    }
}
