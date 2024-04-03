import java.util.ArrayList;
import java.util.List;

public class sequencesWithSumk {

    public static List<List<Integer>> seqWithK(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        helper(arr, 0, ans, list, 0, k);
        return ans;
    }

    public static void helper(int[] arr, int sum, List<List<Integer>> ans, List<Integer> list, int index, int k) {
        if (index == arr.length) {
            if (sum == k) {
                ans.add(new ArrayList<>(list));

            }
            return;

        }

        list.add(arr[index]);
        sum += arr[index];

        helper(arr, sum, ans, list, index + 1, k);

        sum -= arr[index];
        list.remove(list.size() - 1);

        // System.out.println(list);
        helper(arr, sum, ans, list, index + 1, k);

    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 6, 7 };

        System.out.println(seqWithK(arr, 9));
    }
}