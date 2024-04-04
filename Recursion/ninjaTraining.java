
public class ninjaTraining {
    public static int maximumPoints(int points[][], int N) {
        int[][] dp = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <4; j++) {
                dp[i][j] = -1;
            }

        }
        return helper(points, 2, 3, dp);
    }

    public static int helper(int[][] arr, int day, int last, int[][] dp) {
        if (day == 0) {
            int maxi = 0;
            for (int i = 0; i < 3; i++) {
                if (i != last) {
                    maxi = Math.max(maxi, arr[day][i]);
                }

            }
            return maxi;
        }
        if (dp[day][last] != -1) {
            return dp[day][last];
        }
        int maxi = 0;

        for (int i = 0; i < 3; i++) {
            if (i != last) {
                int points = arr[day][i] + helper(arr, day - 1, i, dp);
                maxi = Math.max(maxi, points);
            }
        }
        return dp[day][last] = maxi;

    }

    public static void main(String[] args) {
        int[][] trainingSession = {
                { 1, 2, 5 },
                { 3, 1, 1 },
                { 3, 3, 3 }
        };
        // {10,11,9 },
        // { 4,13,7 },
        // { 1,8,13 },
        // { 8, 3, 7 }

        System.out.println(maximumPoints(trainingSession, trainingSession.length));
        // int[][] dp = new int[trainingSession.length][3];

    }
}
