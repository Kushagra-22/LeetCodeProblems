import java.util.Arrays;

public class twoSum {

    public static void helper(int[] arr, int index, int target, int[] ans) {
        if (ans[0] != Integer.MIN_VALUE && ans[1] != Integer.MIN_VALUE) {
            if (target == 0) {
                return;
            }
            return;
        }
        ans[index] = arr[index];
        System.out.println(Arrays.toString(ans));
        helper(arr, index + 1, target - arr[index], ans);
        ans[index] = Integer.MIN_VALUE;
        helper(arr, index + 1, target, ans);

        return;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 18;
        int[] ans = new int[2];
        ans[0] = Integer.MIN_VALUE;
        ans[1] = Integer.MIN_VALUE;
        // List<Integer>
        helper(arr, 0, target, ans);
        System.out.println(Arrays.toString(ans));

    }
}
