public class houseRobber {
    public static int rob(int[] nums) {
        return 0;
    }

    public static int maxSumNonAdjacentEle(int[] arr, int index) {
        if (index == 0) {
            return arr[index];
        }
        if (index < 0) {
            return 0;
        }
        int pick = arr[index] + maxSumNonAdjacentEle(arr, index - 2);
        int notPick = maxSumNonAdjacentEle(arr, index - 1);
        return Math.max(pick, notPick);
    }

    public static void main(String[] args) {
        int[] arr = { 114, 117, 207, 117, 235, 82, 90, 67, 143, 146, 53, 108, 200, 91, 80, 223, 58, 170, 110, 236, 81,
                90, 222, 160, 165, 195, 187, 199, 114, 235, 197, 187, 69, 129, 64, 214, 228, 78, 188, 67, 205, 94, 205,
                169, 241, 202, 144, 240 };
        System.out.println(maxSumNonAdjacentEle(arr, arr.length - 1));
    }
}
