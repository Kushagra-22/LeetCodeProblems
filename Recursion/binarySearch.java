import java.util.Arrays;

public class binarySearch {
    public static boolean search(int[] nums, int target) {
        // Write your code here.
        System.out.println(Arrays.toString(nums));
        int mid = (0 + nums.length - 1) / 2;

        if (nums.length < 1) {
            return false;
        }
        if (nums[mid] == target) {
            return true;
        } else if (nums[mid] < target) {
            return search(Arrays.copyOfRange(nums, mid + 1, nums.length), target);
        } else {
            return search(Arrays.copyOfRange(nums, 0, mid), target);

        }
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18 };
        int[] arr = { 2, 4, 7, 9, 15 };
        System.out.println(search(arr, 2));
    }
}
