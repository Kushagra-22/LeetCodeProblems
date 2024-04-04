public class houseRobber {
    public static int rob(int[] nums) {
        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = -1;
        }

        return maxSumNonAdjacentEle(nums, nums.length - 1, dp);
    }

    public static int maxSumNonAdjacentEle(int[] arr, int index, int[] dp) {
        if (index == 0) {
            return arr[index];
        }
        if (index < 0) {
            return 0;
        }
        if (dp[index] != -1) {
            return dp[index];
        }

        int pick = arr[index] + maxSumNonAdjacentEle(arr, index - 2, dp);
        int notPick = maxSumNonAdjacentEle(arr, index - 1, dp);
        return dp[index] = Math.max(pick, notPick);
    }

    public static void main(String[] args) {
        int[] arr = { 114, 117, 207, 117, 235, 82, 90, 67, 143, 146, 53, 108, 200, 91, 80, 223, 58, 170, 110, 236, 81,
                90, 222, 160, 165, 195, 187, 199, 114, 235, 197, 187, 69, 129, 64, 214, 228, 78, 188, 67, 205, 94, 205,
                169, 241, 202, 144, 240 };
        System.out.println(rob(arr));
    }
}
