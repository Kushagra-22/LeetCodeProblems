public class SubArr {
    public static int[] subarr(int[] arr, int k) {
        int[] nums = new int[arr.length - k + 1];
        int i = 0, j = 0, sum = 0;
        while (i < arr.length - k + 1) {
            j = i;
            int max = Integer.MIN_VALUE;
            while (j - i < k) {
                max = Math.max(max, arr[j]); // 1, 3, -1, -3, 5, 3, 6, 7
                j++;
            }
            nums[i] = max;
            i++;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] arr = { 1,3,-1,-3,5,3,6,7 };
        int[] nums = (subarr(arr, 3));
        for (int i : nums) {
            System.out.print(i + " ");
        }

    }

}
