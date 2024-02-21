public class maxSubArray {

    public static int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int sum = 0;
        int sum2 = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum2 < sum) {

                sum2 = sum;
            }


            if (sum < 0) {
                sum = 0;
            }


        }
        return sum2;
    }

    public static void main(String[] args) {
        int[] arr = {5, 20, -30, 60, -50, 70};
        System.out.println(maxSubArray(arr));
    }
}

