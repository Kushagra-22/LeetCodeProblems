
public class frogJump {

    public static int dp(int[] nums, int index, int[] dp) {

        if (index == 0) {

            return 0;
        }
        if (dp[index] != -1) {
            return dp[index];
        }
        int left = dp(nums, index - 1, dp) + Math.abs(nums[index] - nums[index - 1]);

        int right = Integer.MAX_VALUE;
        if (index > 1) {
            right = dp(nums, index - 2, dp) + (int) Math.abs(nums[index] - nums[index - 2]);
        }
        return dp[index] = Math.min(left, right);
    }

    public static void main(String[] args) {
        // int[] heights = { 30, 10, 60, 10, 60, 50, 100 };
        int[] heights = { 10, 15, 20 };
        int[] dp = new int[heights.length + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        System.out.println(dp(heights, heights.length - 1, dp));
    }
}
