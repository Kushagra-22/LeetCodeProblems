public class ClimbingStairs {

    public static int dp(int n, int[] dp) {
        if (n == 0 || n == 1) {
            dp[n] = 1;
        }

        else if (dp[n] == 0) {
            dp[n] = dp(n - 1, dp) + dp(n - 2, dp);
        } else {
            dp[n] = dp[n - 1] + dp[n - 2];
        }
        return dp[n];
    }

    public static int climbingStairs(int n) {

        int[] arr = new int[n + 1];
        // int left = climbingStairs(n - 1);
        // int right = climbingStairs(n - 2);

        // return right + left;
        return dp(n, arr);
    }

    public static void main(String[] args) {

        System.out.println(climbingStairs(45));
    }
}
